package top.bienvenido.date_24323;

import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import java.io.File;
import java.util.Arrays;
import kotlin.io.FilesKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/p1.class */
public final class p1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final e2 f268;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final sks f269 = new sks();

    public p1(e2 e2Var) {
        this.f268 = e2Var;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m402() {
        try {
            boolean z = c2.f33;
            File fileM428 = q1.m428(c2.f34, this.f268.f200, "components.bin");
            if (fileM428.exists()) {
                byte[] bytes = FilesKt.readBytes(fileM428);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bytes, 0, bytes.length);
                parcelObtain.setDataPosition(0);
                int i = parcelObtain.readInt();
                int[] iArr = new int[i];
                int[] iArr2 = new int[i];
                parcelObtain.readIntArray(iArr);
                parcelObtain.readIntArray(iArr2);
                parcelObtain.recycle();
                sks sksVar = this.f269;
                sksVar.f527 = i;
                sksVar.f525 = iArr;
                sksVar.f526 = iArr2;
                ServiceInfo[] serviceInfoArr = this.f268.f69.services;
                if (serviceInfoArr != null) {
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        if (!((ComponentInfo) serviceInfo).enabled && m404(((ComponentInfo) serviceInfo).name) == 1) {
                            ((ComponentInfo) serviceInfo).enabled = true;
                        }
                    }
                }
                ActivityInfo[] activityInfoArr = this.f268.f69.activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (!((ComponentInfo) activityInfo).enabled && m404(((ComponentInfo) activityInfo).name) == 1) {
                            ((ComponentInfo) activityInfo).enabled = true;
                        }
                    }
                }
                ProviderInfo[] providerInfoArr = this.f268.f69.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (!((ComponentInfo) providerInfo).enabled && m404(((ComponentInfo) providerInfo).name) == 1) {
                            ((ComponentInfo) providerInfo).enabled = true;
                        }
                    }
                }
                ActivityInfo[] activityInfoArr2 = this.f268.f69.receivers;
                if (activityInfoArr2 != null) {
                    for (ActivityInfo activityInfo2 : activityInfoArr2) {
                        if (!((ComponentInfo) activityInfo2).enabled && m404(((ComponentInfo) activityInfo2).name) == 1) {
                            ((ComponentInfo) activityInfo2).enabled = true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void m403() {
        try {
            sks sksVar = this.f269;
            int i = sksVar.f527;
            int[] iArrCopyOf = Arrays.copyOf(sksVar.f525, i);
            int[] iArrCopyOf2 = Arrays.copyOf(this.f269.f526, i);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInt(i);
            parcelObtain.writeIntArray(iArrCopyOf);
            parcelObtain.writeIntArray(iArrCopyOf2);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            boolean z = c2.f33;
            FilesKt.writeBytes(q1.m428(c2.f34, this.f268.f200, "components.bin"), bArrMarshall);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int m404(String str) {
        try {
            sks sksVar = this.f269;
            int iM2 = a.m2(sksVar.f525, sksVar.f527, str.hashCode());
            if (iM2 < 0) {
                return 0;
            }
            return sksVar.f526[iM2];
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m405(String str, int i) {
        try {
            ComponentInfo componentInfo = (ComponentInfo) this.f268.f72.f258.m385(str.hashCode());
            if (componentInfo == null) {
                return;
            }
            sks sksVar = this.f269;
            if (i == 0) {
                int iM2 = a.m2(sksVar.f525, sksVar.f527, str.hashCode());
                if (iM2 >= 0) {
                    int[] iArr = sksVar.f525;
                    int i2 = iM2 + 1;
                    System.arraycopy(iArr, i2, iArr, iM2, sksVar.f527 - i2);
                    int[] iArr2 = sksVar.f526;
                    System.arraycopy(iArr2, i2, iArr2, iM2, sksVar.f527 - i2);
                    sksVar.f527--;
                }
                if (sksVar.f527 == 0) {
                    sksVar.f527 = 0;
                    int[] iArr3 = i.f158;
                    sksVar.f525 = iArr3;
                    sksVar.f526 = iArr3;
                }
            } else {
                sksVar.m684(str.hashCode(), i);
            }
            componentInfo.enabled = (i == 2 || i == 3) ? false : true;
        } catch (Exception unused) {
        }
    }
}
