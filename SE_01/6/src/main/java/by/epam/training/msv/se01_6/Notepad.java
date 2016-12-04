package by.epam.training.msv.se01_6;

/**
 * This class using for manage notes in notepad.
 * 
 * @author serg
 */
public class Notepad {
	private Note[] notesArray;

	/**
	 * Constructor for Notepad.
	 * 
	 * @param size
	 *            must be an int with number of notes.
	 */
	public Notepad(int size) {
		notesArray = new Note[size];
		for (int i = 0; i < size; i++) {
			notesArray[i] = new Note();
		}
	}

	/**
	 * Will find empty note
	 * 
	 * @return index of first empty note.
	 */
	private int findEmty() {
		int emptyNoteNum = -1;
		for (int i = 0; i < notesArray.length; i++) {
			if ((notesArray[i].getTitle() == null) && (notesArray[i].getText() == null)) {
				emptyNoteNum = i;
				break;
			}
		}
		return emptyNoteNum;
	}

	/**
	 * Method for adding note to notepad.
	 * 
	 * @param title
	 *            must be a string with title.
	 * @param text
	 *            must be a string wihh text.
	 */
	public void addNote(String title, String text) {
		int emptyNoteNum = findEmty();
		notesArray[emptyNoteNum].setTitle(title);
		notesArray[emptyNoteNum].setText(text);
	}

	/**
	 * Method for deleting note.
	 * 
	 * @param num
	 *            must be an int with index of note.
	 */
	public void deleteNote(int num) {
		notesArray[num].setTitle(null);
		notesArray[num].setText(null);
	}

	/**
	 * Method for editing note.
	 * 
	 * @param num
	 *            must be an int with index of note.
	 * @param title
	 *            must be new title for note
	 * @param text
	 *            must be new text for note
	 */
	public void editNote(int num, String title, String text) {
		notesArray[num].setTitle(title);
		notesArray[num].setText(text);
	}

	/**
	 * Method for showing all notes.
	 */
	public void showAllNotes() {
		for (int i = 0; i < notesArray.length; i++) {
			System.out.println(i + " - " + notesArray[i].getTitle() + " - " + notesArray[i].getText());
		}

	}

}
