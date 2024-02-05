package days24;

/**
 * @author SIEUN
 *@date2024. 2. 1. - 오후 12:16:35
 *@subject     찍먹2~
 *@content
 */
public class Ex04 {

	public static void main(String[] args) {

		Button callButton = new Button();
		callButton.setListener(new CallListener());
		callButton.touch();
		
		Button messageButton = new Button();
		messageButton.setListener(new MessageListener());
		messageButton.touch();


	} // main

} // class


class Button{

	// 필드
	OnClickListener listener;

	// 위의 필드의 Setter
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		this.listener.onClick();
	}


	// 중첩 인터페이스
	interface OnClickListener{
		// 상수, 추상메서드, D, S 메서드
		void onClick();  // public abstract 생략
	}

}

// Butoon 클래스 안의 OnClickListener 인터페이스를 구현한 클래스 선언
class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 건다.");
	}

}

class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("문자 메세지를 보낸다.");
	}

}


