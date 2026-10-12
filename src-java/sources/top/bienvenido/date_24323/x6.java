package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.IBinder;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/x6.class */
public final class x6 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final String f410;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final ArrayList f411 = new ArrayList();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final ArrayList f412 = new ArrayList();

    public x6(String str) {
        this.f410 = str;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m564(Uri uri, int i, IBinder iBinder, boolean z) {
        if (i == (uri == null ? 0 : uri.getPathSegments().size() + 1)) {
            this.f412.add(new w6(this, iBinder, z));
            return;
        }
        String authority = uri != null ? i == 0 ? uri.getAuthority() : uri.getPathSegments().get(i - 1) : null;
        int size = this.f411.size();
        for (int i2 = 0; i2 < size; i2++) {
            x6 x6Var = (x6) this.f411.get(i2);
            if (x6Var.f410.equals(authority)) {
                x6Var.m564(uri, i + 1, iBinder, z);
                return;
            }
        }
        x6 x6Var2 = new x6(authority);
        this.f411.add(x6Var2);
        x6Var2.m564(uri, i + 1, iBinder, z);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m563(Uri uri, int i, IBinder iBinder, boolean z, ArrayList arrayList) {
        String authority = null;
        if (i >= (uri == null ? 0 : uri.getPathSegments().size() + 1)) {
            m565(true, iBinder, z, arrayList);
        } else {
            if (uri == null) {
                authority = null;
            } else if (i == 0) {
                authority = uri.getAuthority();
            } else {
                authority = uri.getPathSegments().get(i - 1);
            }
            m565(false, iBinder, z, arrayList);
        }
        int size = this.f411.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = authority;
            x6 x6Var = (x6) this.f411.get(i2);
            if (str == null || x6Var.f410.equals(authority)) {
                String str2 = authority;
                x6Var.m563(uri, i + 1, iBinder, z, arrayList);
                if (str2 != null) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean m562(IBinder iBinder) {
        int size = this.f411.size();
        int i = 0;
        while (i < size) {
            if (((x6) this.f411.get(i)).m562(iBinder)) {
                this.f411.remove(i);
                i--;
                size--;
            }
            i++;
        }
        int size2 = this.f412.size();
        for (int i2 = 0; i2 < size2; i2++) {
            w6 w6Var = (w6) this.f412.get(i2);
            if (w6Var.f385 == iBinder) {
                this.f412.remove(i2);
                iBinder.unlinkToDeath(w6Var, 0);
                break;
            }
        }
        return this.f411.isEmpty() && this.f412.isEmpty();
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m565(boolean z, IBinder iBinder, boolean z2, ArrayList arrayList) {
        int size = this.f412.size();
        for (int i = 0; i < size; i++) {
            w6 w6Var = (w6) this.f412.get(i);
            IBinder iBinder2 = w6Var.f385;
            if ((iBinder2 != iBinder || z2) && (z || w6Var.f386)) {
                arrayList.add(new v6(this, iBinder2, z2));
            }
        }
    }
}
