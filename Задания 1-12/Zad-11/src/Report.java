public class Report implements Copyable {
    private String name;
    private String content;

    public Report(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Report copy() {
        return new Report(name,content);
    }

    @Override
    public String toString() {
        return "Report{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
