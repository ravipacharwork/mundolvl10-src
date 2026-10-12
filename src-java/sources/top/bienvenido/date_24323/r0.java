package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/r0.class */
public abstract class r0 extends Binder implements s0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final /* synthetic */ int f286 = 0;

    public r0() {
        attachInterface(this, "MundoWindowManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoWindowManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoWindowManagerService");
            return true;
        }
        switch (i) {
            case 1:
                Intent intentMo328 = ((n6) this).mo328(parcel.readStrongBinder(), (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                if (intentMo328 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                intentMo328.writeToParcel(parcel2, 1);
                return true;
            case 2:
                Intent[] intentArrMo329 = ((n6) this).mo329(parcel.readStrongBinder(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(intentArrMo329, 1);
                return true;
            case 3:
                ((n6) this).mo330((Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null), parcel.readString());
                return true;
            case 4:
                Intent intentMo331 = ((n6) this).mo331(parcel.readLong(), (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                if (intentMo331 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                intentMo331.writeToParcel(parcel2, 1);
                return true;
            case 5:
                ((n6) this).mo332(parcel.readStrongBinder(), parcel.readStrongBinder());
                return true;
            case 6:
                boolean zM333 = ((n6) this).m333(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zM333 ? 1 : 0);
                return true;
            case 7:
                n6.m383((ActivityInfo) null, parcel.readString(), parcel.readString());
                return true;
            case 8:
                ((n6) this).mo335(parcel.readStrongBinder());
                return true;
            case 9:
                List listMo336 = ((n6) this).mo336(parcel.readLong());
                parcel2.writeNoException();
                if (listMo336 == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size = listMo336.size();
                parcel2.writeInt(size);
                for (int i3 = 0; i3 < size; i3++) {
                    Parcelable parcelable = (Parcelable) listMo336.get(i3);
                    if (parcelable != null) {
                        parcel2.writeInt(1);
                        parcelable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 10:
                List listMo337 = ((n6) this).mo337(parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                if (listMo337 == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size2 = listMo337.size();
                parcel2.writeInt(size2);
                for (int i4 = 0; i4 < size2; i4++) {
                    Parcelable parcelable2 = (Parcelable) listMo337.get(i4);
                    if (parcelable2 != null) {
                        parcel2.writeInt(1);
                        parcelable2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 11:
                ((n6) this).mo338(parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                ComponentName componentNameMo339 = ((n6) this).mo339(parcel.readStrongBinder());
                parcel2.writeNoException();
                if (componentNameMo339 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                componentNameMo339.writeToParcel(parcel2, 1);
                return true;
            case 13:
                String strMo340 = ((n6) this).mo340(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeString(strMo340);
                return true;
            case 14:
                boolean zMo341 = ((n6) this).mo341(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo341 ? 1 : 0);
                return true;
            case 15:
                ((n6) this).mo342xaa30c2c7(parcel.readString(), parcel.readString());
                return true;
            case 16:
                boolean zMo343 = ((n6) this).mo343(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(zMo343 ? 1 : 0);
                return true;
            case 17:
                ((n6) this).mo344(parcel.readString());
                return true;
            case 18:
                String strMo345 = ((n6) this).mo345();
                parcel2.writeNoException();
                parcel2.writeString(strMo345);
                return true;
            case 19:
                boolean zMo346 = ((n6) this).mo346();
                parcel2.writeNoException();
                parcel2.writeInt(zMo346 ? 1 : 0);
                return true;
            case 20:
                parcel.readString();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
