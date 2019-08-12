package prob2;

public class SmartPhone extends MusicPhone {
	public void execute( String function ) {
		if(function.equals("앱")) 
			playApp();
		if(function.equals("통화")) 
			call();
		if(function.equals("음악")) 
			playMusic();
		
	}

	private void playApp() {
		System.out.println( "앱실행" );
	}
	private void call(){
		System.out.println( "통화기능시작" );
	}
	protected void playMusic(){
		System.out.println( "다운로드해서 음악재생" );
	}
}
