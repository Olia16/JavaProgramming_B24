package HomeWork.SocialMediaTask;

public abstract class SocialMedia {
    String personalURL;
    int accountLength;
    static String platform;

   public abstract void DirectMessaging(String username, String message);
   public abstract void post();
   public abstract void notifications();


     /*
    Create an abstract class for Social Media that has the following features:

 - Direct messaging(String username, String message)
 - Post(String body)
 - Notifications()

• The Social Media will also have the following fields:

 - Personal URl (String)
 - Account length (int)
 - Platform (static String)
     */

}
