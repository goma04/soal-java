package metadslx.languages.soal; //1:1

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.stream.Stream;
import metadslx.core.ModelObject; //4:1
import java.util.List; //5:1

@SuppressWarnings("unused")
public class SoalPrinter { //2:1
    private List<ModelObject> Instances; //2:1

    public SoalPrinter() { //2:1
    }

    public SoalPrinter(List<ModelObject> instances) { //2:1
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

    public String Generate() { //7:1
        StringBuilder __out = new StringBuilder();
        AtomicInteger __loop1_counter = new AtomicInteger();
        __enumerate(Instances).forEach(__loop1_var1 -> { //8:7
            __enumerate(__loop1_var1).filter(ns_filter -> (Object)ns_filter instanceof Namespace).map(ns_map -> (Namespace)(Object)ns_map).forEach(ns -> { //8:18
                int __loop1_iteration = __loop1_counter.incrementAndGet();
                StringBuilder __tmp2 = new StringBuilder();
                __tmp2.append(GenerateNamespace(ns));
                try (BufferedReader __tmp2Reader = this.__toReader(__tmp2.toString())) {
                    boolean __tmp2_first = true;
                    boolean __tmp2_last = !__tmp2Reader.ready();
                    while(__tmp2_first || !__tmp2_last) {
                        __tmp2_first = false;
                        String __tmp2Line = __tmp2Reader.readLine();
                        __tmp2_last = !__tmp2Reader.ready();
                        if (__tmp2Line != null) __out.append(__tmp2Line);
                        if (!__tmp2_last) __out.appendLine(true);
                        __out.appendLine(false); //9:24
                    }
                } catch (IOException e) {
                    // nop
                }
            });
        });
        return __out.toString();
    }

    public String GenerateNamespace(Namespace ns) { //13:1
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

