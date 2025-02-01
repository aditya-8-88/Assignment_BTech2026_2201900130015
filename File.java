import java.util.*;

class File {
    private String name;
    private double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }
}

class Folder {
    private String name;
    private List<File> files = new ArrayList<>();

    public void addFile(File file) { files.add(file); }
}
