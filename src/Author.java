public class Author {
        private String nameAuthor;
        private String surnameAuthor;

        public Author(String nameAuthor, String surnameAuthor) {
            this.nameAuthor = nameAuthor;
            this.surnameAuthor = surnameAuthor;
        }

        public String getNameAuthor() {

            return this.nameAuthor;
        }

        public String getSurnameAuthor() {

            return this.surnameAuthor;
        }

        public boolean equals(Object other) {
            if (this.getClass() != other.getClass()) {
                return false;
            }
            Author c2 = (Author) other;
            return nameAuthor.equals(c2.nameAuthor);
        }

        public int hashCode() {
            return java.util.Objects.hash(nameAuthor);
        }

        public String toString() {
            return "Автор: " + this.nameAuthor + " " + this.surnameAuthor;
        }
    }

