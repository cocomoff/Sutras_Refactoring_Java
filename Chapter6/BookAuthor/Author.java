class Author {
    private String _name;
    private String _mail;

    public String getName() { return _name; }
    public String getMail() { return _mail; }

    public Author(String name, String mail) {
	_name = name;
	_mail = mail;
    }

    public void setName(String name) { _name = name; }
    public void setMail(String mail) { _mail = mail; }
}
