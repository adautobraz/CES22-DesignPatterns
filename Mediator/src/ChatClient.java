
public class ChatClient {
	public static void main(String[] args){
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator,"Adauto");
		User user2 = new UserImpl(mediator,"Caio");
		User user3 = new UserImpl(mediator,"Rosse");
		User user4 = new UserImpl(mediator,"Filipe");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("E a� Galera?");

	}
}
