package com.multithreading;
import java.util.Random;

//file downloader logic


class FileDownloader extends Thread {

    private final String fileName;
    private final Random random = new Random();

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int progress = 0; progress <= 100; progress += 10) {
            System.out.println("[" + getName() + "] Downloading "
                    + fileName + ": " + progress + "%");
            try {
                Thread.sleep(200 + random.nextInt(300)); // random delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class FileDownloaderThreads {
    public static void main(String[] args) throws InterruptedException {

        FileDownloader d1 = new FileDownloader("Document.pdf");
        FileDownloader d2 = new FileDownloader("Image.jpg");
        FileDownloader d3 = new FileDownloader("Video.mp4");

        d1.setName("Thread-1");
        d2.setName("Thread-2");
        d3.setName("Thread-3");

        d1.start();
        d2.start();
        d3.start();

        d1.join();
        d2.join();
        d3.join();

        System.out.println("All downloads complete!");
    }
}
