package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/n0.class */
public abstract class n0 extends Binder implements p0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final /* synthetic */ int f234 = 0;

    public n0() {
        attachInterface(this, "MundoPackageManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoPackageManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoPackageManagerService");
            return true;
        }
        switch (i) {
            case 1:
                boolean zMo263x541a43c1 = ((r5) this).mo263x541a43c1(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo263x541a43c1 ? 1 : 0);
                return true;
            case 2:
                boolean zContainsKey = r5.f291.containsKey(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zContainsKey ? 1 : 0);
                return true;
            case 3:
                PackageInfo packageInfoMo265 = ((r5) this).mo265(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                if (packageInfoMo265 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                packageInfoMo265.writeToParcel(parcel2, 1);
                return true;
            case 4:
                ApplicationInfo applicationInfoMo266 = ((r5) this).mo266(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                if (applicationInfoMo266 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                applicationInfoMo266.writeToParcel(parcel2, 1);
                return true;
            case 5:
                ActivityInfo activityInfo = (ActivityInfo) r5.m463((ComponentName) o0.m390(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (activityInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                activityInfo.writeToParcel(parcel2, 1);
                return true;
            case 6:
                ActivityInfo activityInfo2 = (ActivityInfo) r5.m463((ComponentName) o0.m390(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (activityInfo2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                activityInfo2.writeToParcel(parcel2, 1);
                return true;
            case 7:
                ServiceInfo serviceInfo = (ServiceInfo) r5.m463((ComponentName) o0.m390(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (serviceInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                serviceInfo.writeToParcel(parcel2, 1);
                return true;
            case 8:
                ProviderInfo providerInfo = (ProviderInfo) r5.m463((ComponentName) o0.m390(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (providerInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                providerInfo.writeToParcel(parcel2, 1);
                return true;
            case 9:
                List listMo271 = ((r5) this).mo271((Intent) o0.m390(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                o0.m391(parcel2, listMo271, 1);
                return true;
            case 10:
                List listMo272 = ((r5) this).mo272((Intent) o0.m390(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                o0.m391(parcel2, listMo272, 1);
                return true;
            case 11:
                ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(q1.m429(((r5) this).mo275((Intent) o0.m390(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt())));
                parcel2.writeNoException();
                if (resolveInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                resolveInfo.writeToParcel(parcel2, 1);
                return true;
            case 12:
                ResolveInfo resolveInfo2 = (ResolveInfo) CollectionsKt.firstOrNull(q1.m429(((r5) this).mo271((Intent) o0.m390(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt())));
                parcel2.writeNoException();
                if (resolveInfo2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                resolveInfo2.writeToParcel(parcel2, 1);
                return true;
            case 13:
                List listMo275 = ((r5) this).mo275((Intent) o0.m390(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                o0.m391(parcel2, listMo275, 1);
                return true;
            case 14:
                List listMo276 = ((r5) this).mo276((Intent) o0.m390(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                o0.m391(parcel2, listMo276, 1);
                return true;
            case 15:
                ArrayList arrayListMo296 = ((r5) this).mo296(parcel.readInt());
                parcel2.writeNoException();
                o0.m391(parcel2, arrayListMo296, 1);
                return true;
            case 16:
                ArrayList arrayListMo297xaa30c2c7 = ((r5) this).mo297xaa30c2c7(parcel.readInt());
                parcel2.writeNoException();
                o0.m391(parcel2, arrayListMo297xaa30c2c7, 1);
                return true;
            case 17:
                ProviderInfo providerInfoMo277 = ((r5) this).mo277(parcel.readString());
                parcel2.writeNoException();
                if (providerInfoMo277 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                providerInfoMo277.writeToParcel(parcel2, 1);
                return true;
            case 18:
                ArrayList arrayListMo2985 = ((r5) this).mo2985(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                o0.m391(parcel2, arrayListMo2985, 1);
                return true;
            case 19:
                String strMo278x4f52efc = ((r5) this).mo278x4f52efc(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo278x4f52efc);
                return true;
            case 20:
                ((r5) this).mo279(parcel.readString());
                return true;
            case 21:
                int iMo280 = ((r5) this).mo280(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo280);
                return true;
            case 22:
                String[] strArrMo281xb7bf1d91 = ((r5) this).mo281xb7bf1d91(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrMo281xb7bf1d91);
                return true;
            case 23:
                String strMo282 = ((r5) this).mo282(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(strMo282);
                return true;
            case 24:
                String[] strArrMo283 = ((r5) this).mo283(parcel.createIntArray());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrMo283);
                return true;
            case 25:
                int iMo284 = ((r5) this).mo284(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo284);
                return true;
            case 26:
                int iMo285 = ((r5) this).mo285(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iMo285);
                return true;
            case 27:
                ((r5) this).mo286(parcel.readString(), parcel.readString());
                return true;
            case 28:
                ((r5) this).mo287(parcel.readString(), parcel.readString());
                return true;
            case 29:
                String[] strArrMo288xb7bf1d91 = ((r5) this).mo288xb7bf1d91(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrMo288xb7bf1d91);
                return true;
            case 30:
                r5.f293xaa30c2c7.block(10000L);
                parcel2.writeNoException();
                return true;
            case 31:
                boolean zMo290 = ((r5) this).mo290(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo290 ? 1 : 0);
                return true;
            case 32:
                ArrayList arrayListMo299 = ((r5) this).mo299();
                parcel2.writeNoException();
                parcel2.writeStringList(arrayListMo299);
                return true;
            case 33:
                ((r5) this).mo291(parcel.readInt());
                return true;
            case 34:
                boolean zMo292xaa30c2c7 = ((r5) this).mo292xaa30c2c7(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo292xaa30c2c7 ? 1 : 0);
                return true;
            case 35:
                ((r5) this).mo293(parcel.createTypedArrayList(PackageManager.ComponentEnabledSetting.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                ((r5) this).mo294((ComponentName) o0.m390(parcel, ComponentName.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 37:
                int iMo295 = ((r5) this).mo295((ComponentName) o0.m390(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(iMo295);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
