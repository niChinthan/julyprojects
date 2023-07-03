package com.first.julyproject;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
//		int k = scan.nextInt();
		
//		int sum=scan.nextInt();
		
	/*	int m = scan.nextInt();
		int[] b = new int[m];
		for(int i=0;i<b.length;i++) {
			b[i]=scan.nextInt();
		}
		
		int o = scan.nextInt();
		int[] c = new int[o];
		for(int i=0;i<c.length;i++) {
			c[i]=scan.nextInt();
		}      */
		
//		int res = findMaximumNumber(a);
//		System.out.print(res+" ");
//		averageOfElements(a);
//		printHighestAndLowestSumOfNumbers(a);
//		int[] res = printHighestAndLowestProductOfNumbers(a);
//		for(int i=0;i<res.length;i++) {
//			System.out.print(res[i]+" ");
//		}
//		int res = countSpecificElement(a,k);
//		System.out.println(res);
//		System.out.println(indexOfElement(a,k));
//		secondLargest(a);
//		countStars(n);
//		findMissingNumber(a,n);
//		findMaxElementAndCount(a);
//		smallestRepeatingNumber(a);
//		occurenceOfEach(a);
//		uniqueElement(a);
//		printRepeated(a);
//		frequencyOfLargest(a);
//		frequencyOfSmallest(a);
//		printInbetween(a);
//		printAllPairs(a);
//		printPairsSumEqualToK(a,k);
/*		int[] res = sortedResultOfTwoArrays(a,b);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}  */
//		mergeThreeArrays(a,b,c);
//		subArraysOfSizeKEqualToSum(a,k,sum);
//		subArraysOfAllSize(a);
//		printMinusOneToLeft(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
/*		printAllZerosAtTheEnd(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		} */
//		printRepeatedInTwoArrays(a,b);
//		printZerosAndOnes(a);
//		longestConsecutiveSubArray(a);
//		System.out.println(smallestSubArraySumGreaterThanX(a,x));
		smallestMissingNumber(a);
	}

	
	
	private static void smallestMissingNumber(int[] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min && a[i]>=0) {
				min=a[i];
			}
		}
		
	}



	private static int smallestSubArraySumGreaterThanX(int[] a, int x) {
		for(int k=1;k<=a.length;k++) {
			for(int i=0;i<=a.length-k;i++) {
				int sum=0;
				for(int j=i;j<k+i;j++) {
					sum=sum+a[j];
				}
				if(sum>x) {
					int count=0;
					for(int j=i;j<k+i;j++) {
						count++;
					} 
					return count;
				}
			}
		}
		return -1;
	}



	private static void longestConsecutiveSubArray(int[] a) {
		int start=0;
		int end=0;
		int si=0;
		int ei=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]+1==a[i+1]) {
				ei++;
			}
			else {
				if(ei-si>end-start) {
					start=si;
					end=ei;
				}
				si=i+1;
				ei=i+1;
			} 
		}
		if(ei-si>end-start) {
			start=si;
			end=ei;
		}
		for(int i1=start;i1<=end;i1++) {
			System.out.print(a[i1]+" ");
		}
	}



	private static void printZerosAndOnes(int[] a) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			while(a[i]==1) {
				i++;
			}
			while(a[j]==0) {
				j--;
			}
			if(i<j) {
				a[i]=1;
				a[j]=0;
			}
			i++;
			j--;

		}
		for(int i1=0;i1<a.length;i1++) {
			System.out.print(a[i1]+" ");
		} 
	}



	private static void printRepeatedInTwoArrays(int[] a, int[] b) {
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
			if(a[i]==b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			}else if(a[i]>b[j]) {
				j++;
			}else {
				i++;
			}
		}
	}



	private static void printAllZerosAtTheEnd(int[] a) {
		int i=0;
		int j=0;
		while(i<a.length) {
			if(a[i]!=0) {
				a[j++]=a[i++];
			}else {
				i++;
			}
		}
		while(j<a.length) {
			a[j]=0;
			j++;
		}
	}



	private static void printMinusOneToLeft(int[] a) {
		int i=a.length-1;
		int j=a.length-1;
		while(i>=0) {
			if(a[i]>=0) {
				a[j--]=a[i--];
			}else {
				i--;
			}
		}
		while(j>=0) {
			a[j]=-1;
			j--;
		}
	}



	private static void subArraysOfAllSize(int[] a) {
		for(int k=1;k<=a.length;k++) {
			for(int i=0;i<=a.length-k;i++) {
				for(int j=i;j<k+i;j++) {
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
		}
	}



	private static void subArraysOfSizeKEqualToSum(int[] a, int k, int value) {
		for(int i=0;i<=a.length-k;i++) {
			int sum=0;
			for(int j=i;j<k+i;j++) {
				sum=sum+a[j];
			}
			if(sum==value) {
				for(int j=i;j<k+i;j++) {
					System.out.print(a[j]+" ");
				}	
				System.out.println();
			}
		}
	}



	private static void mergeThreeArrays(int[] a, int[] b, int[] c) {
		int[] res = new int[a.length+b.length+c.length];
		
		int i=0;
		int z=0;
		while(z<res.length) {
			if(i<a.length) {
				res[z++]=a[i];
			}
			if(i<b.length) {
				res[z++]=b[i];
			}
			if(i<c.length) {
				res[z++]=c[i];
			}
			i++;
		}
		for(int i1=0;i1<res.length;i1++) {
			System.out.print(res[i1]+" ");
		}
	}



	private static int[] sortedResultOfTwoArrays(int[] a, int[] b) {
		int[] res = new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				res[k]=a[i];
				k++;
				i++;
			}
			else {
				res[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			res[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			res[k]=b[j];
			k++;
			j++;
		}
		return res;
	}



	private static void printPairsSumEqualToK(int[] a, int k) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]-a[j]==k || a[j]-a[i]==k ) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}



	private static void printAllPairs(int[] a) {
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++) {
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}



	private static void printInbetween(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]%2!=0 && a[i+1]%2!=0) {
				System.out.print(a[i]+"*");
			}
			else if(a[i]%2==0 && a[i+1]%2==0) {
				System.out.print(a[i]+"#");
			}
			else {
				System.out.print(a[i]+"$");
			}
		}
		System.out.print(a[a.length-1]);
	}



	private static void frequencyOfSmallest(int[] a) {
		 int min = Integer.MAX_VALUE;
		 int count=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]<min) {
				 min=a[i];
			 }
		 }
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==min) {
				 count++;
			 }
		 }System.out.println(count);
	}



	private static void frequencyOfLargest(int[] a) {
		 int max = Integer.MIN_VALUE;
		 int count=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]>max) {
				 max=a[i];
			 }
		 }
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==max) {
				 count++;
			 }
		 }System.out.println(count);
	}



	private static void printRepeated(int[] a) {
		int count=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count++;
			}
			else {
				if(count>1) {
					System.out.println(a[i]);
				}
				count=1;
			}
		}
		if(count>1) {
			System.out.println(a[a.length-1]);
		}
	}



	private static void uniqueElement(int[] a) {
		int count=1;
		int uniqueCount=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count++;
			}else {
				if(count==1) {
					uniqueCount++;
				}
				count=1;
			}
		}
		if(count==1) {
			uniqueCount++;
		}
		System.out.println(uniqueCount);
	}



	private static void occurenceOfEach(int[] a) {
		int count=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count++;
			}else {
				System.out.println(a[i]+" - "+count);
				count=1;
			}
		}
		System.out.println(a[a.length-1]+" - "+count);
	}



	private static void smallestRepeatingNumber(int[] a) {
		for(int i=a.length-1;i>0;i--) {
			if(a[i]==a[i-1]) {
				System.out.println(a[i]);
				System.exit(i);
			}
		}
		System.out.println(-1);
	}



	private static void findMaxElementAndCount(int[] a) {
		int count=1;
		int maxCount=0;
		int maxNumber=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count++;
			}else {
				if (count>maxCount) {
					maxCount=count;
					maxNumber=a[i];
				}count=1;
			}
		}
		if (count>maxCount) {
			maxCount=count;
			maxNumber=a[a.length-1];
		}
		System.out.println(maxNumber +" : "+maxCount);
	}



	private static void findMissingNumber(int[] a, int n) {
	    int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum +a[i];
		}  
		int n1=n+1;
		n1=n1*(n1+1)/2;
		System.out.println(n1-sum);
	}



	private static void countStars(int n) {
		n=n*(n+1)/2;
		System.out.println(n);
	}



	private static void secondLargest(int[] a) {
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
			}
			else if (a[i]>secondMax && a[i]!=max) {
				secondMax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
	}



	private static int indexOfElement(int[] a, int k) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				return i;
			}
		}
		return -1;
	}



	private static int countSpecificElement(int[] a, int k) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				count++;
			}
		}return count;
	}



	private static int[] printHighestAndLowestProductOfNumbers(int[] a) {
		int product=1;
		int[] res = new int[a.length];
		for(int i=0;i<a.length;i++) {
			product=product*a[i];
		}
		for(int i=0;i<res.length;i++) {
			res[i]=product/a[i];
		}
		return res;
	}



	private static void printHighestAndLowestSumOfNumbers(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		int maxValue = sum-min;
		int minValue = sum-max;
		System.out.println(maxValue);
		System.out.println(minValue);	
	}

	
	
	
	private static void averageOfElements(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		System.out.println(avg);
	}

	
	
	
	private static int findMaximumNumber(int[] a) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
}
