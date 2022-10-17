//#2
public class ArraySum{

    public static void main(String []args){

        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

            if (exampleArray[ i ]>maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }

        }


        System.out.println(index);


        //Two syntax error in given code double maximum = examplesArray[0]; here examplesArray[0] no variabe is there for this name, So correct syntax is:- double maximum = exampleArray[0];
        // " for (int i = 1; i<exampleArray.length>; i++){ " here "i<exampleArray.length>" not valid syntax remove last ">" then it's right.
       // So, after removing this error answer is 2











    }
}
