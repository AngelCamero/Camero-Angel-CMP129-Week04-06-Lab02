CMP 129 – Computer Science II
Weeks 4 and 6 – Lab 2: Sorting Algorithm Benchmark
Learning Objectives

After completing this lab, students should be able to:

Create and copy integer arrays.
Implement bubble sort and selection sort.
Pass arrays to methods.
Count exchanges performed by sorting algorithms.
Compare the behavior of two sorting algorithms.
Display and verify sorted array values.
Problem 1: Sorting Benchmarks

Write a Java program that compares the number of exchanges performed by the bubble sort and selection sort algorithms.

Program Requirements

Your program must:

Create an integer array containing at least 20 values.
Create an identical copy of the original array.
Pass the first array to a method that sorts it using bubble sort.
Count every exchange made by the bubble sort method.
Pass the second array to another method that sorts it using selection sort.
Count every exchange made by the selection sort method.
Sort both arrays in ascending order.
Display both sorted arrays.
Display the number of exchanges performed by each algorithm.
Identify which algorithm made fewer exchanges. If the values are equal, display an appropriate message.

Both algorithms must begin with identical values arranged in the same order so that the comparison is fair.

Required Methods

Create a method named:

bubbleSort

This method must:

Accept an integer array as its parameter.
Sort the array in ascending order using bubble sort.
Count the number of exchanges.
Return the exchange count as an int.

Create another method named:

selectionSort

This method must:

Accept an integer array as its parameter.
Sort the array in ascending order using selection sort.
Count the number of exchanges.
Return the exchange count as an int.
Example Output Format
Bubble Sort Results
Sorted array: 2 5 8 11 14 17 20 ...
Number of exchanges: 62

Selection Sort Results
Sorted array: 2 5 8 11 14 17 20 ...
Number of exchanges: 17

Selection sort made fewer exchanges.

The exact number of exchanges will depend on the original values and their order.

Required Filename
SortingBenchmarks.java
General Requirements
Use two identical arrays containing at least 20 integers.
Do not use Arrays.sort() or another built-in sorting method.
Implement both sorting algorithms yourself.
Perform the sorting inside the required methods.
Count an exchange only when two array elements are swapped.
Use loops to display the sorted arrays.
Use meaningful variable and method names.
Include comments explaining both sorting algorithms and the exchange counters.
Follow standard Java naming and formatting conventions.
Test the program with more than one set of array values.
Confirm that both resulting arrays are sorted identically.
Ensure the program compiles and runs without errors.
Follow the course AI-use policy.
Record any AI assistance in AI-Use-Report.md.
Required Organization

Keep these files directly in the repository root:

- `CMP129-Week-04-06-Lab-02.md`
- `AI-Use-Report.md`
- `SortingBenchmarks.java`

Do not create or use a `src` folder.


The Java file may initially contain:

/*
 * Student Name:
 * Course: CMP 129
 * Week: 4
 * Lab: 2
 * Assignment: Sorting Algorithm Benchmark
 * Date:
 */
Submission

Students must push:

SortingBenchmarks.java
Lab-02/AI-Use-Report.md

A suitable commit message is:

Complete sorting algorithm benchmark
