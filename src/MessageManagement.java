import java.util.ArrayList;
import java.util.List;

public class MessageManagement {
    List<Message> allMessage;


    private List<Message> getMessages(int userId){
        List<Message> userMessage = new ArrayList<>();

        for(int i = 0; i < allMessage.size(); i++){
            if(allMessage.get(i).getReceiverId() == userId){
                userMessage.add(allMessage.get(i));
            }
        }
        return userMessage;
    }

    private List<Message> getUnreadMessages(int userId){
        List<Message> userMessage = new ArrayList<>();

        for(int i = 0; i < allMessage.size(); i++){
            if(allMessage.get(i).getReceiverId() == userId && !allMessage.get(i).getRead()){
                userMessage.add(allMessage.get(i));
            }
        }
        return userMessage;
    }

    private void read(int messageId){
        for(int i = 0; i < allMessage.size(); i++){
            if (allMessage.get(i).getId() == messageId){
                allMessage.get(i).setRead(true);
            }
        }
    }


   // public Message(int senderId, int receiverId, String content, Boolean isRead, int id) {
    private void newMessage(User sender, User receiver, String content){
        Message message = new Message(sender.getId(), receiver.getId(), content, false);
        allMessage.add(message);
    }

    private void deleteMessage(int messageId){
        for(int i = 0; i < allMessage.size(); i++){
            if (allMessage.get(i).getId() == messageId){
                allMessage.remove(i);
            }
        }
    }
}
