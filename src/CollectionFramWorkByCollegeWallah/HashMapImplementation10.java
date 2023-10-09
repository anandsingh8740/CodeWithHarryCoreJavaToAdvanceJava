package CollectionFramWorkByCollegeWallah;

import java.util.LinkedList;

public class HashMapImplementation10 {

    static class MyHashMap<K, V>{  // generic function  k , V is a type
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;

            }
        }

        private int n;  // number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){  // N - capacity/size of buckets array
           buckets = new LinkedList[N];
           for(int i =0; i<buckets.length; i++){
               buckets[i] = new LinkedList<>();
           }
        }

        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        // Traverses the ll and looks for a node with key, if found it returns it's index otherwise
        // it return null
        private int searchInBucket(LinkedList<Node> ll ,K key){
            for(int i =0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length*2);
            n =0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key, node.value);
                    }
                }
        }

        public int size(){  // return the number of entries in map
          return n;
        }

        public void put(K key, V value) {   // insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) { // Key doesn't exist, we have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }else{  // update case
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            if(n>= buckets.length * DEFAULT_LOAD_FACTOR){  // n is a number of entries
                 rehash();
            }
        }
        public V get(K key){    // get return karega value(V)
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){  // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // key doesn't exist
            return null;
        }
        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            // 3 >= 4 * .75
            if(ei != -1){  // key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--; // we are removing value the value will decrease.
                return val;
            }
            // key doesn't exist
            return null;

        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer>mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        System.out.println("CAPACITY" + mp.capacity()); // 4
        System.out.println("LOAD" + mp.load()); //
        mp.put("c",3);
        mp.put("x",61);
        mp.put("y",71);
        mp.put("c",30);
        System.out.println("Testing size " +mp.size());  // 3    // 5
        mp.put("c", 30);
        System.out.println("Testing size " +mp.size());   // 3

        // Testing get
        System.out.println(mp.get("x"));   //1  // 61
        System.out.println(mp.get("y"));   // 2  // 71
//        System.out.println(mp.get("c"));   // 30
//        System.out.println(mp.get("college"));   // null
//
//
//        System.out.println(mp.remove("c"));   // 30
//        System.out.println(mp.remove("c"));   // null
//        System.out.println("Testing size " +mp.size());  //2

        System.out.println("CAPACITY " + mp.capacity()); //8
        System.out.println("LOAD " + mp.load()); // <0.75

    }
}
