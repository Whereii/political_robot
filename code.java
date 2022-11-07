import java.util.*;

public class code {


    public static int questionOne(){
        Scanner scn = new Scanner(System.in);

        System.out.println("In this test we will ask you 7 questions relating to politics. The minute we think we know what party you may be a part of, we will let you know!");

        System.out.println("Do you generally want more goverment regulation, or less?");
        System.out.println("1: Yes, the smaller the better");
        System.out.println("2: No, more goverment programs are good");
        System.out.println("3: I don't care, as long as it doesn't affect how I live now");
        System.out.println("4: There should be a balance between both sides");

        int answer = scn.nextInt();

        if(answer == 1){
            return 1;
        } else if(answer == 2){
            return 2;
        } else if(answer == 3){
            return 3;
        } else if(answer == 4){
            return 4;
        } else {
            return 5;
        }
    }

    public static int questionTwo(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Do the rich people have too much money and should learn to share?");
        System.out.println("1: No, that is not how the world works");
        System.out.println("2: Yea, it needs to be redistrobuted");
        System.out.println("3: It depends on the situation. As long as it doesn't afford them any opportunities that I cannot achieve");
        System.out.println("4: They may have a lot but as long as I have a cofortable life then i don't really care");

        int answer = scn.nextInt();

        if(answer == 1){
            return 1;
        } else if(answer == 2){
            return 2;
        } else if(answer == 3){
            return 4;
        } else if(answer == 4){
            return 3;
        } else {
            return 5;
        }
    }

    public static int questionThree(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Should all healthcare be free?");
        System.out.println("1: Absolutly, it is a human right");
        System.out.println("2: No, I need to work hard to be able to be healthy and happy");
        System.out.println("3: That seems like a good goal to strive for");
        System.out.println("4: Maybe not free but absolutly more affordable");

        int answer = scn.nextInt();

        if(answer == 1){
            return 2;
        } else if(answer == 2){
            return 1;
        } else if(answer == 3){
            return 3;
        } else if(answer == 4){
            return 4;
        } else {
            return 5;
        }
    }

    public static int questionFour(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Speach can be dangerous and dangerous speach should not be permited");
        System.out.println("1: Some speach just isn't necessary");
        System.out.println("2: The constitution allows us to say whatever we want as long as it isn't the call for violence");
        System.out.println("3: Dangerous speach that hurts feelings should be outlawed and legally seen as assult");
        System.out.println("4: People can say what they want");

        int answer = scn.nextInt();

        if(answer == 1){
            return 4;
        } else if(answer == 2){
            return 1;
        } else if(answer == 3){
            return 2;
        } else if(answer == 4){
            return 3;
        } else {
            return 5;
        }
    }

    public static int questionFive(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Do you think that racial wrongs of the past need to be repaid today?");
        System.out.println("1: Absolutly. White people commited numerous horrific crimes in the past that need to be attoned for");
        System.out.println("2: Racism is racism including racism by allowing people of color to have more opportunities now just based on race alone");

        int answer = scn.nextInt();

        if(answer == 1){
            return 2;
        } else if(answer == 2){
            return 1;
        } else {
            return 5;
        }
    }

    public static int questionSix(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Do you believe that pushing the issue of transgender into the forefront as being something that is good is a good thing?");
        System.out.println("1: It is damaging society especially for younger children");
        System.out.println("2: The people who are unaccepting of this issue are the problem");
        System.out.println("3: I think it is a good conversation to be had, just not when involving children");

        int answer = scn.nextInt();

        if(answer == 1){
            return 1;
        } else if(answer == 2){
            return 2;
        } else if(answer == 3){
            return 4;
        } else {
            return 5;
        }
    }

    public static int questionSeven(){
        Scanner scn = new Scanner(System.in);

        System.out.println("What needs to be done with the police");
        System.out.println("1: Nothing");
        System.out.println("2: More funding so that they can be trained better");
        System.out.println("3: Defund the police and completely disband them");
        System.out.println("4: As long as they stay inside the law then they are fine");

        int answer = scn.nextInt();

        if(answer == 1){
            return 4;
        } else if(answer == 2){
            return 1;
        } else if(answer == 3){
            return 2;
        } else if(answer == 4){
            return 3;
        } else {
            return 5;
        }
    }
    


    public static void checkAnswers(int one, int two, int three, int four){
        if(one > 2){
            System.out.println("#############################################################");
            System.out.println("According to our database, you fall under the catagory of republican");
        } else if(two > 2) {
            System.out.println("#############################################################");
            System.out.println("According to our database, you fall under the catagory of democrat");
        } else if(three > 2) {
            System.out.println("#############################################################");
            System.out.println("According to our database, you fall under the catagory of non-affiliated");
        } else if(four > 2) {
            System.out.println("#############################################################");
            System.out.println("According to our database, you fall under the catagory of moderate");
        } else {
            System.out.println("#############################################################");
            System.out.println("More data required");
        }
    }

    public static void main(String[] args){

        int repb = 0;
        int demo = 0;
        int nonAffil = 0;
        int moderate = 0;

        int answerOne = questionOne();

        while(answerOne != 1 & answerOne != 2 & answerOne != 3 & answerOne != 4) {
            System.out.println("Please enter a valid answer");
            answerOne = questionOne();
        }

        if(answerOne == 1){
            repb++;
        } else if(answerOne == 2){
            demo++;
        } else if(answerOne == 3){
            nonAffil++;
        } else if(answerOne == 4){
            moderate++;
        }


        int answerTwo = questionTwo();

        while(answerTwo != 1 & answerTwo != 2 & answerTwo != 3 & answerTwo != 4){
            System.out.println("Please enter a valid answer");
            answerTwo = questionTwo();
        }
        
        if(answerTwo == 1){
            repb++;
        } else if(answerTwo == 2){
            demo++;
        } else if(answerTwo == 3){
            nonAffil++;
        } else if(answerTwo == 4){
            moderate++;
        }

        int answerThree = questionThree();

        while(answerThree != 1 & answerThree != 2 & answerThree != 3 & answerThree != 4){
            System.out.println("Please enter a valid answer");
            answerThree = questionThree();
        }
        
        if(answerThree == 1){
            repb++;
        } else if(answerThree == 2){
            demo++;
        } else if(answerThree == 3){
            nonAffil++;
        } else if(answerThree == 4){
            moderate++;
        }

        checkAnswers(repb, demo, nonAffil, moderate);
        if(repb > 2 || demo > 2 || nonAffil > 2 || moderate > 2){
            System.exit(0);
        }

        int answerFour = questionFour();

        while(answerFour != 1 & answerFour != 2 & answerFour != 3 & answerFour != 4){
            System.out.println("Please enter a valid answer");
            answerFour = questionFour();
        }
        
        if(answerFour == 1){
            repb++;
        } else if(answerFour == 2){
            demo++;
        } else if(answerFour == 3){
            nonAffil++;
        } else if(answerFour == 4){
            moderate++;
        }

        checkAnswers(repb, demo, nonAffil, moderate);
        if(repb > 2 || demo > 2 || nonAffil > 2 || moderate > 2){
            System.exit(0);
        }


        int answerFive = questionFive();

        while(answerFive != 1 & answerFive != 2){
            System.out.println("Please enter a valid answer");
            answerFive = questionFive();
        }
        
        if(answerFive == 1){
            repb++;
        } else if(answerFive == 2){
            demo++;
        } else if(answerFive == 3){
            nonAffil++;
        } else if(answerFive == 4){
            moderate++;
        }

        checkAnswers(repb, demo, nonAffil, moderate);
        if(repb > 2 || demo > 2 || nonAffil > 2 || moderate > 2){
            System.exit(0);
        }

        int answerSix = questionSix();

        while(answerSix != 1 & answerSix != 2 & answerSix != 3){
            System.out.println("Please enter a valid answer");
            answerSix = questionSix();
        }
        
        if(answerSix == 1){
            repb++;
        } else if(answerSix == 2){
            demo++;
        } else if(answerSix == 3){
            nonAffil++;
        } else if(answerSix == 4){
            moderate++;
        }

        checkAnswers(repb, demo, nonAffil, moderate);
        if(repb > 2 || demo > 2 || nonAffil > 2 || moderate > 2){
            System.exit(0);
        }

        int answerSeven = questionSeven();

        while(answerSeven != 1 & answerSeven != 2 & answerSeven != 3 & answerSeven != 4){
            System.out.println("Please enter a valid answer");
            answerSeven = questionSeven();
        }
        
        if(answerSeven == 1){
            repb++;
        } else if(answerSeven == 2){
            demo++;
        } else if(answerSeven == 3){
            nonAffil++;
        } else if(answerSeven == 4){
            moderate++;
        }

        checkAnswers(repb, demo, nonAffil, moderate);
        if(repb > 2 || demo > 2 || nonAffil > 2 || moderate > 2){
            System.exit(0);
        } else {
            System.out.println("It seems like our software isn't advanced enough and we have some more work to do");
        }

    }
}