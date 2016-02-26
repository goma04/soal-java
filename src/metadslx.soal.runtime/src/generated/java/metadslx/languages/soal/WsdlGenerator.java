package metadslx.languages.soal; //1:1

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class WsdlGenerator { //2:1
    private Object Instances; //2:1

    public WsdlGenerator() { //2:1
        this.properties = new __Properties();
    }

    public WsdlGenerator(Object instances) { //2:1
        this();
        this.Instances = instances;
    }

    private BufferedReader __toReader(String text) {
        String enc = "UTF-8";
        byte[] bytes = null;
        try {
            if (text != null) {
                bytes = text.getBytes(enc);
            }
        } catch (UnsupportedEncodingException e) {
            bytes = null;
        }
        if (bytes == null) {
            bytes = new byte[0];
        }
        try {
            return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes), enc));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    private <T> Stream<T> __var(T item) {
        ArrayList<T> result = new ArrayList<>();
        result.add(item);
        return result.stream();
    }

    private <T> Stream<T> __enumerate(T item) {
        ArrayList<T> result = new ArrayList<>();
        result.add(item);
        return result.stream();
    }

    private <T> Stream<T> __enumerate(Iterable<T> items) {
        ArrayList<T> result = new ArrayList<>();
        for (T item: items) {
            result.add(item);
        }
        return result.stream();
    }

    private int counter = 0;
    private int nextCounter() {
        return ++counter;
    }

    private XsdGenerator XsdGenerator = new XsdGenerator(); //4:1

    private __Properties properties; //6:1
    public __Properties getProperties() { //6:1
        return properties;
    }

    public static class __Properties { //6:1
        private __Properties() {
            this.singleFileWsdl = false; //7:27
            this.separateXsdWsdl = false; //8:28
        }
        private boolean singleFileWsdl; //6:1
        public boolean getSingleFileWsdl() { //6:1
            return singleFileWsdl;
        }
        public void setSingleFileWsdl(boolean singleFileWsdl) { //6:1
            this.singleFileWsdl = singleFileWsdl;
        }

        private boolean separateXsdWsdl; //6:1
        public boolean getSeparateXsdWsdl() { //6:1
            return separateXsdWsdl;
        }
        public void setSeparateXsdWsdl(boolean separateXsdWsdl) { //6:1
            this.separateXsdWsdl = separateXsdWsdl;
        }

    }

    public String generate(Namespace ns) { //11:1
        StringBuilder __out = new StringBuilder();
        return __out.toString();
    }

    private static class StringBuilder {
        private boolean newLine;
        private java.lang.StringBuilder builder = new java.lang.StringBuilder();
        
        public StringBuilder() {
            this.newLine = true;
        }
        
        public void append(String str) {
            if (str == null) return;
            if (!"".equals(str)) {
                this.newLine = false;
            }
            builder.append(str);
        }
        
        public void append(Object obj) {
            if (obj == null) return;
            String text = obj.toString();
            this.append(text);
        }
        
        public void appendLine() {
            this.appendLine(false);
        }
        
        public void appendLine(boolean force) {
            if (force || !this.newLine) {
                builder.append("\n");
                this.newLine = true;
            }
        }
        
        @Override
        public String toString() {
            return builder.toString();
        }
    }
}

