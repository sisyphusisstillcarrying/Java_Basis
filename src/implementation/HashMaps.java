package src.implementation;

import implementation.syso;

public class HashMaps {
    public static void main(String[] args) {
        //made up of key-value pairs
        //search, insert, delete in O(1) time complexity
        //HashMap is a part of the Java Collection framework
        //HashMap is a class that is used to store key-value pairs
        //internally programming languages uses hash maps to connects variables and values in any programming language internally. Hashing used in cryptography, password storage, etc.

        //hastable is synchronized, hashmap is not synchronized
        //defination of hashtable: Hashtable is a collection class that implements a hashtable data structure. It is similar to HashMap, but is synchronized.

        //Hashcode: hashcode is a unique identifier for objects. It is used to provide the address of an object in memory. The hashcode() method is used to get the hashcode of an object.

        // 1. We need all the elements as positive numbers we use hascode function for this.
        // Hashcode function is used to convert the key into a positive number. hashcode is are very large so we use the concept of hashing to reduce them to a manageable size.
        // We reduce all elements in table to a size m
        // hashcode % m = index of the table where we will store the value and hashcode is a unique number for each key.
        //hashing is a technique to convert a large number into a small number by taking the remainder when divided by a small number.
        // Let we give it a value to put in the table. Eg - Civo -> Hashcode -> 1234 -> 1234 % m (hashing) = 4 
        //all are done in amortized time complexity of O(1) for all operations. not exactly O(1) but very close to it.

        // 2. Collision: When two keys have the same hashcode, it is called a collision. We can use separate chaining or linear probing to resolve collisions.


        // Separate Chaining: In separate chaining, each bucket is a linked list. When a collision occurs, the key-value pairs are stored in the linked list.
        //load factor of simple uniform hashing is 0.75f (75% of the map size)
        //simple uniform hashing: each key is equally likely to be hashed to any of the m slots in the table, independent of where other keys are hashed.
        // Linear Probing: In linear probing, when a collision occurs, the key-value pair is stored in the next available bucket. If the next bucket is also full, the key-value pair is stored in the next available bucket, and so on.
        // 3. Load Factor: The load factor is the ratio of the number of elements to the number of buckets. The load factor is used to decide when to increase the size of the hash table. The default load factor of HashMap is 0.75f (75% of the map size).
        
        //Hash function:It is a function that converts the key into a unique number. The hash function is used to calculate the index of the table where the value will be stored.
        // 1. Division Method: h(k) = k mod m
        // 2. Multiplication Method: h(k) = floor(m * (k * A mod 1))
        // 3. Universal Hashing: h(k) = ((ak + b) mod p) mod m
        //size of table shouble be q(n) all the time. n is the number of elements in the table. if n > q(n) then rehashing is done.
        // 4. Rehashing: Rehashing is the process of increasing the size of the hash table when the load factor exceeds the threshold. Rehashing is done to reduce the number of collisions and improve the performance of the hash table.
        //size increases by 2x when rehashing is done. example: if the size of the table is 4 then after rehashing it will be 8. cost to rehash is O(n) where n is the number of elements in the table. therefore when we add one element it takes O(1) which is amortized time complexity.
        //shrinking is not done in hashmap. it is done in hashtable. when the number of elements is less than 25% of the table size then the table is shrinked by 2x.
        // 5. Time Complexity: The time complexity of search, insert, and delete operations in a hash table is O(1) on average. In the worst case, the time complexity is O(n).

        //open addressing: In open addressing, when a collision occurs, the key-value pair is stored in the next available bucket. If the next bucket is also full, the key-value pair is stored in the next available bucket, and so on.
        // 1. Linear Probing: In linear probing, when a collision occurs, the key-value pair is stored in the next available bucket. If the next bucket is also full, the key-value pair is stored in the next available bucket, and so on. when we search for a key we have to check all the buckets until we find the key.linear probing formula: h(k, i) = (h1(k) + i) mod m
        // 2. Quadratic Probing: In quadratic probing, when a collision occurs, the key-value pair is stored in the next available bucket. If the next bucket is also full, the key-value pair is stored in the next available bucket, and so on. The difference is that the next bucket is calculated using a quadratic function.quadratic probing formula: h(k, i) = (h1(k) + i^2) mod m
        // 3. Double Hashing: In double hashing, when a collision occurs, the key-value pair is stored in the next available bucket. If the next bucket is also full, the key-value pair is stored in the next available bucket, and so on. The difference is that the next bucket is calculated using a second hash function.double hasing formula: h(k, i) = (h1(k) + i * h2(k)) mod

        //uniform hashing assumption: each key is equally likely to be hashed to any of the m slots in the table, independent of where other keys are hashed. cost of next operation <= c * (1 + load factor) where c is a constant.

        //when to use which hashing technique:
        // 1. Separate Chaining: Separate chaining is used when the number of collisions is high. Separate chaining is efficient when the load factor is high.
        // 2. open addressing is used when the number of collisions is low. open addressing is efficient when the load factor is low.

        HashMap<String,Integer> map = new HashMap<>();

        //inserting elements
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println());

        // what I learned from 1:15 min of kunal khushwa's video on hashmap is learn oops to understand the implementation and complexity and working of these data structures.and just learn the implementation form any where and come back to java documentation gfg to better understand the working of these data structures. but practice after learning just enough basics and implementation of these data structures.

        //course is good till the just beore LL video after that only binary trees. 
        

    }
    
}
