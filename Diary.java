package DiaryProject;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String ownerName;
    private ArrayList<Entry> entries = new ArrayList<>();
    private String password;

    public Diary(String ownerName, String password) {
        this.ownerName = ownerName;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPassword(String message) {
        return message;

    }

    public String getPassword() {
        return password;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = (ArrayList<Entry>) entries;
    }


    public void canAddGist(String title, String story, String password) {
        if (password.equals(password)) {
            Entry myGist = new Entry(title, story);
            entries.add(myGist);
        } else {
            throw new IllegalArgumentException("invalid password");
        }
    }

    public Entry findGistByTitle(String gistTitle) {
            for (Entry gist : entries) {
                if (gist.getTitle().equalsIgnoreCase(gistTitle))
                    return gist;
            }


            throw new IllegalArgumentException("Gist not found");
        }

    public void canRemoveGist(String gistTitle, String story, String correctPassword) {

        for(Entry removeGist : entries) {
            if(removeGist.getTitle().equalsIgnoreCase(gistTitle) && correctPassword.equals(password)) ;{
                entries.remove(removeGist);

            }

                throw new IllegalArgumentException("gist not on the list");
            
        }
    }
}

