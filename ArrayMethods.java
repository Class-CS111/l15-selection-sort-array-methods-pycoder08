/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: <Pseudocode for selection sort here>
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: 
   * Returns a string representation of the array.
   * 
   * Parameters:
   * @param a the array of integers to be converted to a string
  */

  public static String arrayString(int[] a)
  {
    String arrayString = "{ ";
    // For loop to append each element of the array to the string
    for (int currentIndex = 0; currentIndex < a.length - 1; currentIndex++)
    {
      arrayString = arrayString + a[currentIndex] + ", ";
    }
    // We end the loop one element early and add the last element manually to avoid a trailing comma
    arrayString = arrayString + a[a.length - 1] + " }";
    return arrayString;
  }
  
  /**DESCRIPTION:
   * Swaps the elements at the specified indices in the array.
   * @param array the array of integers in which to swap elements
   * @param a the index of the first integer element to swap
   * @param b the index of the second integer element to swap
   */

  public static void swap(int[] array, int a, int b)
  {
    //We store one element in a temporary variable to avoid it being overwritten
    int storedElement;
    
    storedElement = array[a];
    array[a] = array[b];
    array[b] = storedElement;
  }
	
	/**DESCRIPTION: 
   * Returns the index of the minimum value in the array starting from the specified index.
   * @param array the array of integers to search for the minimum value
   * @param startIndex the integer value index from which to start searching for the minimum value
  */
  public static int indexOfMin(int[] array, int startIndex)
  {
    // We set the current minimum and index of that minimum to be the starting element and index
    int currentMin = array[startIndex];
    int minIndex = startIndex; 

    // We loop through, updating the current minimum and index if we find a smaller element
    for (int index = startIndex; index < array.length; index++)
    {
      if (array[index] < currentMin)
      {
        currentMin = array[index];
        minIndex = index;
      }
    }
    return minIndex;
  }

	/**DESCRIPTION: 
   * Reverses the order of the elements in the array.
   * @param array the array of integers to be reversed
  */
  public static void reverse(int[] array)

  /*  We loop through the elements of the array, awapping the current element with
      the element on the appropriate index from the end of the array */
  {
    for (int index = 0; index < array.length/2; index++)
    {
      ArrayMethods.swap(array, index, array.length - index - 1);
    }
  }

	/**DESCRIPTION: 
   * Sorts the array in ascending order
   * @param array the array of integers to be sorted
  */
  public static void selectionSort(int[] array)
  {
    // We loop through the array, swapping each value with the smallest subsequent value using the indexOfMin method we alrteady made
    for (int index = 0; index < array.length; index++)
    {
      ArrayMethods.swap(array, index, ArrayMethods.indexOfMin(array, index));
    }
  }

}