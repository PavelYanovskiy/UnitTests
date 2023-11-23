package HomeTask_4.Task_2.test.message;

import message.MessageService;
import message.NotificationService;

class NotificationServiceTest {

    @HomeTask_4.Task_2.test.book.Test
    void testMessageSend(){
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("test", "user");
        verify(messageService,times(1)).sendMessage("test", "user");

    }

    private MessageService verify(MessageService messageService, Object times) {
        return null;
    }

    private Object times(int i) {
        return null;
    }

    private MessageService mock(Class<MessageService> class1) {
        return null;
    }

}