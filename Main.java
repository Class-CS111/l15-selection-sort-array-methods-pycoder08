/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	<date>
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
    int[] stringArray = new int[11];
    for (int i = 0; i < stringArray.length; i++)
    {
      stringArray[i] = i + 1;
    }
    System.out.println(ArrayMethods.arrayString(stringArray));
    ArrayMethods.swap(stringArray, 0, 1);
    System.out.println(ArrayMethods.arrayString(stringArray));
    System.out.println(ArrayMethods.indexOfMin(stringArray, 0));
    ArrayMethods.reverse(stringArray);
    System.out.println(ArrayMethods.arrayString(stringArray));
    ArrayMethods.selectionSort(stringArray);
    System.out.println(ArrayMethods.arrayString(stringArray));
  }
}