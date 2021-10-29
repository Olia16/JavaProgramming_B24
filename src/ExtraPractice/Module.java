package ExtraPractice;

import java.util.ArrayList;

public class Module {

    ArrayList<File> files;

    public Module(){
        files = new ArrayList<>();
    }

    public Module(ArrayList<File> files){
        this();
        this.files = files;
    }

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }
    public void addFile(File file){
        files.add(file);
    }

    public void removeFile(File file){
        files.remove(file);
    }


}
