package top.bienvenido.mundo.common.ext;

import android.app.IBinderSession;
import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/mundo/common/ext/MundoServiceConnection.class */
@Metadata(mv = {2, 2, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0012J#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltop/bienvenido/mundo/common/ext/MundoServiceConnection;", "Landroid/app/IServiceConnection$Stub;", "Landroid/content/ServiceConnection;", "serviceConnection", "<init>", "(Landroid/content/ServiceConnection;)V", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Landroid/app/IBinderSession;", "iBinderSession", "", "z", "", "connected", "(Landroid/content/ComponentName;Landroid/os/IBinder;Landroid/app/IBinderSession;Z)V", "dead", "(Landroid/content/ComponentName;Landroid/os/IBinder;Z)V", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "mundo"}, xi = 48)
public class MundoServiceConnection extends IServiceConnection.Stub {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final ServiceConnection f530;

    public MundoServiceConnection(ServiceConnection serviceConnection) {
        this.f530 = serviceConnection;
    }

    public void connected(ComponentName name, IBinder service) {
        ServiceConnection serviceConnection = this.f530;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }

    public void connected(ComponentName name, IBinder service, IBinderSession iBinderSession, boolean z) {
        ServiceConnection serviceConnection = this.f530;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }

    public void connected(ComponentName name, IBinder service, boolean dead) {
        ServiceConnection serviceConnection = this.f530;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }
}
