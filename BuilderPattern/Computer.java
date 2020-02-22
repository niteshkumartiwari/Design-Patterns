package BuilderPattern;

class Computer {
    private String compName;
    private String os;
    private String processor;
    private int version;

    private Computer(Builder builder) {
        this.compName = builder.compName;
        this.os = builder.os;
        this.processor = builder.processor;
        this.version = builder.version;
    }

    @Override
    public String toString() {
        return "Computer [compName=" + compName + ", os=" + os + ", processor=" + processor + ", version=" + version
                + "]";
    }

    static class Builder {
        private String compName;
        private String os;
        private String processor;
        private int version;

        public Builder setCompName(String compName) {
            this.compName = compName;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setVersion(int version) {
            this.version = version;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}