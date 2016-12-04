package by.epam.training.msv.se01_6;

/**
 * This class using for saving notes data.
 */
public class Note {
	private String title;
	private String text;

	/**
	 * Getter for title property of the note.
	 * 
	 * @return title string.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Getter for text property of the note.
	 * 
	 * @return text string.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Setter for title property.
	 * 
	 * @param str
	 *            must be a string with title of the note.
	 */
	public void setTitle(String str) {
		title = str;
	}

	/**
	 * Setter for text property.
	 * 
	 * @param str
	 *            must be a string with text of the note.
	 */
	public void setText(String str) {
		text = str;
	}

}
