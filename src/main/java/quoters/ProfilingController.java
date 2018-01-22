package quoters;

/**
 * Created by Vladimir Glinskikh on 22.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
