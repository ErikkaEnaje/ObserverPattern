package ObservePattern;
import java.util.*;

public class NewsSubscriberService { public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        NewsAgency agency = new NewsAgency();

        System.out.println("\\n\\t\\t ˜”*°•.Greetings from the Real-time News Subscription Service!.•°*”˜ \n");

        // in order to improve the classification of news updates in the future.
        List<String> newsCategories = new ArrayList<>(Arrays.asList("☽ GOSSIP CELEBRITY ☾,\"♡ LIFE STYLE UPDATE ♡ \""));

        System.out.println("Current News Categories: " + newsCategories + " \n");

        subscribers sub1 = new subscribers("Penolope Featherington");
        subscribers sub2 = new subscribers("Colin Bridgerton");

        // Subscribe
        agency.subscribe(sub1);
        agency.subscribe(sub2);

        // store subscriber for Preference's List.
        List<subscribers> subscribers = new ArrayList<>(Arrays.asList(sub1, sub2));

        // save the "GOSSIP CELEBRITY" preference list as it is at the moment.
        List<String> strings = new ArrayList<>(List.of("☽ GOSSIP CELEBRITY ☾"));
        System.out.println("➵ List of current subscriber preferences: ");

        for (ObservePattern.subscribers subscriber : subscribers) {
            subscriber.modifyPreferenceses(strings);
        }
        
        // News was released by Current News Agency.
        agency.newsUpdate("\n\t\t\t\t[GOSSIP CELEBRITY] ‘Chapter closed’: Kathryn Bernardo and Daniel Padilla confirm breakup");

        boolean b = true;
        while (b) {
            System.out.print("\n\t\tWould you like to modify your selection? (Y/N): ");
            String userChoiceE = inputUser.nextLine();

            // if the user don't want to change their preference. Users are always notified if there is new breaking news.
            if (!userChoiceE.toLowerCase().equals("y")) {
                System.out.println();
                agency.newsUpdate("[LIFE STYLE UPDATE] Effective strategies to overcome the winter weight loss plateau!");

                System.out.print("\n\t\tDo you want to continue of life style update? (Y/N): ");
                    String userChoiceR = inputUser.nextLine();

                    if (!userChoiceR.toLowerCase().equals("y")) {
                        agency.newsUpdate("[LIFE STYLE UPDATE] 263 of the world’s longest-living people share their 8 ‘non-negotiables’ for a long, happy life!");
                        continue;
                    }
                }
            }

            // If the user desires to modify their preferences.
            System.out.println("\n\t\tList of Subscribers:");
            System.out.println("\n\t\t1.) Penolope Featherington");
            System.out.println("\n\t\t2.) Colin Bridgerton");


            System.out.print("\n\t\tEnter the name of your subscriber (Pick 1 - 3) here. ");
            Integer nameSubscriber = inputUser.nextInt();
            inputUser.nextLine();

            switch (nameSubscriber) {
                case 1:
                    System.out.println("\nWhat are your goals? ");
                    System.out.println("1.) Subscribe");
                    System.out.println("2.) Unsubscribe");
                    System.out.println("3.) Modify your preference");

                    System.out.print("\nChoose 1 to 3 only: ");
                    Integer userChoiceI = inputUser.nextInt();
                    inputUser.nextLine();

                    switch (userChoiceI) {
                        case 1: // subscribe.
                            agency.subscribe(sub1);
                            System.out.println();
                            break;

                        case 2: // unsubscribe.
                            agency.unsubscribe(sub1);
                            System.out.println();
                            break;

                        case 3: // Modify his/her preference.
                            for (ObservePattern.subscribers subscriber : subscribers) {
                                if (subscriber.getName().matches("Penolope Featherington")) {
                                    System.out.print("\n\t\tChoose new preferences [LIFE STYLE UPDATE] only: ");
                                    strings = Arrays.asList(inputUser.nextLine().split(","));
                                    subscriber.modifyPreferenceses(strings);
                                    agency.unsubscribe(sub1);
                                    System.out.println();
                                }
                            }
                            break;
                        default: // if the user inputs invalid input.
                            System.out.println("\n\t\tError! Please only enter 1 through 3. Try it one more. \n");
                    }

                    // Recently released, explosive news.
                    agency.newsUpdate("[LIFE STYLE UPDATE] 263 of the world’s longest-living people share their 8 ‘non-negotiables’ for a long, happy life!");

                    break;

                case 2:
                    System.out.println("\n\t\tWhat are your goals? ");
                    System.out.println("\n\t\t1.) Subscribe");
                    System.out.println("\n\t\t2.) Unsubscribe");
                    System.out.println("\n\t\t3.) Modify your preference");

                    System.out.print("\n\t\tChoose 1 to 3 only: ");
                    Integer userChoiceK = inputUser.nextInt();
                    inputUser.nextLine();

                    switch (userChoiceK) {
                        case 1:// subscribe.
                            agency.subscribe(sub2);
                            System.out.println();
                            break;

                        case 2:// unsubscribe.
                            agency.unsubscribe(sub2);
                            System.out.println();
                            break;

                        case 3:// Modify his/her preference.
                            for (ObservePattern.subscribers subscriber : subscribers) {
                                if (subscriber.getName().matches("Colin Bridgerton")) {
                                    System.out.print("\nChoose new preferences [GOSSIP CELEBRITY] only: ");
                                    strings = Arrays.asList(inputUser.nextLine().split(","));
                                    subscriber.modifyPreferenceses(strings);
                                    agency.unsubscribe(sub2);
                                    System.out.println();
                                }
                            }
                            break;
                        default:
                            System.out.println("\n\t\t Error! Please only enter 1 through 3. Try it one more. \n");
                    }

                    // Recently released, explosive news.
                    agency.newsUpdate("[GOSSIP CELEBRITY] ‘Chapter closed’: Kathryn Bernardo and Daniel Padilla confirm breakup\"");

                    break;
            }
            // ask the user if they wish to restart the programme.
            System.out.print("\n\t\tWould you like to run again the program? (Y/N): ");
            String userChoiceF = inputUser.nextLine();
            System.out.println();

            if (!userChoiceF.toLowerCase().equals("y")) {
                System.out.println("Programmed by: Erikka Marielle Enaje | 3 BSCS - 1");
            }
        inputUser.close(); // scanner close.
        }


}






























































