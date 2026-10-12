package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/d0.class */
public abstract class d0 extends Binder implements f0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final /* synthetic */ int f52 = 0;

    public d0() {
        attachInterface(this, "MundoActivityManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoActivityManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoActivityManagerService");
            return true;
        }
        switch (i) {
            case 1:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                if (i3 > 1000000) {
                    throw new BadParcelableException("Array too large: " + i3);
                }
                ProviderInfo[] providerInfoArr = i3 < 0 ? null : new ProviderInfo[i3];
                int i4 = parcel.readInt();
                if (i4 > 1000000) {
                    throw new BadParcelableException("Array too large: " + i4);
                }
                String[] strArr = i4 < 0 ? null : new String[i4];
                IBinder iBinderMo75 = ((w3) this).mo75(string, string2, providerInfoArr, strArr, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderMo75);
                parcel2.writeTypedArray(providerInfoArr, 1);
                parcel2.writeStringArray(strArr);
                return true;
            case 2:
                ComponentName componentNameMo76xaa30c2c7 = ((w3) this).mo76xaa30c2c7((Intent) e0.m128(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                if (componentNameMo76xaa30c2c7 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                componentNameMo76xaa30c2c7.writeToParcel(parcel2, 1);
                return true;
            case 3:
                int iMo77 = ((w3) this).mo77((Intent) e0.m128(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo77);
                return true;
            case 4:
                boolean zMo78 = ((w3) this).mo78((ComponentName) e0.m128(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zMo78 ? 1 : 0);
                return true;
            case 5:
                int iMo79 = ((w3) this).mo79((Intent) e0.m128(parcel, Intent.CREATOR), parcel.readStrongBinder(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo79);
                return true;
            case 6:
                boolean zMo80 = ((w3) this).mo80(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(zMo80 ? 1 : 0);
                return true;
            case 7:
                boolean zMo81 = ((w3) this).mo81(parcel.readStrongBinder(), (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null), parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(zMo81 ? 1 : 0);
                return true;
            case 8:
                IBinder iBinderMo82 = ((w3) this).mo82((ComponentName) e0.m128(parcel, ComponentName.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderMo82);
                return true;
            case 9:
                ArrayList arrayListMo83 = ((w3) this).mo83(parcel.readInt());
                parcel2.writeNoException();
                int size = arrayListMo83.size();
                parcel2.writeInt(size);
                for (int i5 = 0; i5 < size; i5++) {
                    Parcelable parcelable = (Parcelable) arrayListMo83.get(i5);
                    if (parcelable != null) {
                        parcel2.writeInt(1);
                        parcelable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 10:
                String[] strArrMo84 = ((w3) this).mo84(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrMo84);
                return true;
            case 11:
                ((w3) this).mo85(parcel.readInt(), parcel.readStrongBinder(), (IntentFilter) (parcel.readInt() != 0 ? IntentFilter.CREATOR.createFromParcel(parcel) : null));
                return true;
            case 12:
                ((w3) this).mo86(parcel.readStrongBinder());
                return true;
            case 13:
                int iMo87 = ((w3) this).mo87((Intent) e0.m128(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo87);
                return true;
            case 14:
                ((w3) this).mo88(parcel.readString(), parcel.readString());
                return true;
            case 15:
                boolean zM333 = n6.f241.m333(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zM333 ? 1 : 0);
                return true;
            case 16:
                u5.m513();
                return true;
            case 17:
                IBinder iBinderMo91 = ((w3) this).mo91((Intent) e0.m128(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderMo91);
                return true;
            case 18:
                ((w3) this).mo925(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 19:
                ((w3) this).mo93(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
