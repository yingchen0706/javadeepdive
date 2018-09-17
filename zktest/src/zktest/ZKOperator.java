package zktest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;

class ConnectWatcher implements Watcher {
    CountDownLatch ct;

    public ConnectWatcher(CountDownLatch ct) {
        this.ct = ct;
    }

    public void process(WatchedEvent event) {
        KeeperState state = event.getState();
        if (state == KeeperState.SyncConnected) {
            System.out.println("Connected");
            ct.countDown();
        }
    }
}

class Processer implements Watcher {

    @Override
    public void process(WatchedEvent event) {
        System.out.println(event.getType());
        System.out.println(event.getPath());
        switch (event.getType()) {
        case NodeCreated:
            System.out.println("Path: " + event.getPath());
            break;
        default:
            break;
        }
    }

}

public class ZKOperator {
    public static void main(String args[]) {
        try {
            CountDownLatch ct = new CountDownLatch(1);
            ConnectWatcher cw = new ConnectWatcher(ct);

            ZooKeeper zk = new ZooKeeper("slc13msx.us.oracle.com:2181", 300000, cw);
            ct.await();

            try {
                Watcher wc = new Processer();
                // zk.getData("/data/test", wc, null);
                zk.exists("/data/test", wc);
                List<String> list = zk.getChildren("/", null);
                for (String s : list) {
                    System.out.println(s);
                }
            } catch (KeeperException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            Thread.sleep(20000);
            zk.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
