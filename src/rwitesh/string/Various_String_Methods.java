package rwitesh.string;

public class Various_String_Methods {
    public static void main(String[] args) {

        //Note the that index of a string starts from 0
        String name = "Rwitesh";
        String college = "Academy of Technology";
        System.out.println(name);
        System.out.println(college);

        int len = name.length(); //Return length of string
        System.out.println(len);
        int len2 = college.length();
        System.out.println(len2);

        System.out.println(name.toLowerCase()); //Transform uppercase to lowercase
        System.out.println(college.toLowerCase());

        System.out.println(name.toUpperCase());//Transform Lowercase to Uppercase
        System.out.println(college.toUpperCase());

        String nonTrimmed = "    Netflix    ";
        System.out.println(nonTrimmed.trim()); // Remove whitespaces from the beginning and the end

        System.out.println(name.substring(2)); // Return string from index 2 to end
        System.out.println(name.substring(2,5)); // Return string from index 2 to (5-1)=4

        System.out.println(name.replace('R','W')); // Replace all the occurences of oldChar with newChar

        System.out.println(name.replace("Rwi","Ni"));

        System.out.println(name.startsWith("Rwi")); // return true if the string starts with arguments
        System.out.println(name.endsWith("Na"));// Return true if it ends with the arguments

        System.out.println(name.charAt(3)); // Return char at index 3

        System.out.println(name.indexOf('w')); // Return the index of 'w'
        System.out.println(name.indexOf("it")); // Return index of 'i' of the "it"

        System.out.println(name.equals("Rwitesh")); // Return true if the string is equal to the string given in the parentheses
        System.out.println(name.equalsIgnoreCase("rWITesh")); // return true if the string is equal to the string given in the parentheses without checking the cases whether it is upper or not
    }
}
