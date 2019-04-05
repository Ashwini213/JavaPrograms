/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.algorithmPrograms.PrimeNum;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.QueueLinkedList;

/**
 * @author all
 *
 */
public class PrimeAnagramQueue {
		/*
		* The main function is to print the 2 dimension representation
		* of the prime numbers from 0-1000 using queue
		*/
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			
			QueueLinkedList<Integer> queue=new QueueLinkedList<Integer>(1000);
				List<Integer> primenumber = new ArrayList<Integer>();
				primenumber =algorithmPrograms.PrimeNum(); //finding prime
				queue = DataStructurePrograms.primeAnagram2(primenumber); //finding anagram
				System.out.println(queue.getSize()+" is the size of queue");
				System.out.println("Elements in a queue are :");
				while(!queue.isQueueEmpty())
				{
					queue.remove();
					queue.remove();
					System.out.println();
				}
		}
	}

