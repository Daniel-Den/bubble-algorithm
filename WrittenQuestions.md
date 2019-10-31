1. Describe the best case scenario for run-time. Why is this the best case scenario?

  The best case senario is one in which the list is already sorted. Not only will this senario mean that no time will be spent switching 
the location of two items, but in the improved algorithm (as described in question 3) the counter will not be incremented, so the 
algorithm will finsih after the first iteration of comparing numbers, giving an O(n) run-time; really O(n-1), but big O notation does no 
account for such small differences.

2. Explain the run-time complexity of bubble sort. Is the algorithm efficient or inefficient for large lists? Why or why not?

  Bubble sort checks each item in the list less one for the number of items in the list (i.e it compares each item in the list with the 
next item in the list, fliping them to be in the right order if nessessary, and cycles through the entire list while doing this as many 
times as there are items in the list). This means it's runtime increases expoentially as the list length increases, a O(n<sup>2</sup>) 
runtime, as a result it is very inefficent for large lists.

3. Describe *one* improvement that can be made to the basic algorithm that was described in class.

  By adding a counter that increments by one each time two numbers are flipped the runtime can potentially improved greatly. If the 
counter does not increase, then it means the list is sorted and algorithm is finished. Otherwise, the counter will be reset and another 
iteration of comparing the numbers will begin until there is one that does no need changing and the process will be finished, as 
previously mentioned.

4. How would one change the code to sort a list of characters instead of a list of numbers.

  Inorder to sort the characters according to their unicode values, only various initalizers and the populateArray method will need to be 
changed to accomidate charactes. The java will simply compare each characters unicode value to determine their value. To order the 
characters in some other way, such as by scrabble point values, a hash table will need to be constructed to hold those values with the 
letters as keys. The values for these keys will then need to be compared to order the characters.
