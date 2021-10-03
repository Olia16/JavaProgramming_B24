package day21_loop;

public class SMSparts {
    /*
    [SMS parts]
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
Separate these parts and print them separately: Sender: actualSender
Number: actualNumber Message: actualMessage”
     */
    public static void main(String[] args) {
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        int indexOfSenderBegin = msg.indexOf("<");
        int indexOfSenderClosing = msg.indexOf(">");
        int indexOfNumberBegin = msg.indexOf("[");
        int indexOfNumberClose = msg.indexOf("]");

        int indexOfMsgBegin = msg.indexOf("{");
        int indexofMsgClose = msg.indexOf("}");

        String sender = msg.substring(indexOfSenderBegin + 1, indexOfSenderClosing);
        String number = msg.substring(indexOfNumberBegin + 1,indexOfNumberClose);
        String message = msg.substring(indexOfMsgBegin +1, indexofMsgClose);
        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);




    }

}
