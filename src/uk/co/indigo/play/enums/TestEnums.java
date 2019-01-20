package uk.co.indigo.play.enums;

public class TestEnums {

	public enum MainMenu {FILE, EDIT, SOURCE};
	
	public static void main(String[] args) {
		
		for (MainMenu menu : MainMenu.values()) {
			System.out.println(menu);
		}
		
		for (BookCovers cover : BookCovers.values()) {
			System.out.println(cover);
		}
		
	}

}
