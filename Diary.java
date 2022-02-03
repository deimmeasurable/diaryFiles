package DiaryProject;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String ownerName;
    private ArrayList<Entry> gist = new ArrayList<>();
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

    public List<Entry> getGist() {
        return gist;
    }

    public void setGist(List<Entry> gist) {
        this.gist = (ArrayList<Entry>) gist;
    }


    public void canAddGist(String title, String story, String password) {
        if (password.equals(password)) {
            Entry myGist = new Entry(title, story);
            gist.add(myGist);
        } else {
            throw new IllegalArgumentException("invalid password");
        }
    }

    public Entry findGistByTitle(String gistTitle) {
            for (Entry gist : gist) {
                if (gist.getTitle().equalsIgnoreCase(gistTitle))
                    return gist;
            }


            throw new IllegalArgumentException("Gist not found");
        }


    public void canDeleteGist(String gistTitle, String password) {
        if (this.password.equals(password)){
            for(Entry entry: gist){
                if (entry.getTitle().equalsIgnoreCase(gistTitle)){
                    gist.remove(entry);
                    break;
                }
                else {
                    throw new IllegalArgumentException("Gist not found");
                }
            }
        }
        else {
            throw new IllegalArgumentException("Password Not Correct");
        }
    }
}




