package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/h0.class */
public abstract class h0 extends Binder implements i0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final /* synthetic */ int f125 = 0;

    public h0() {
        attachInterface(this, "MundoContentService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoContentService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoContentService");
            return true;
        }
        if (i == 1) {
            ((q4) this).mo153((Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), parcel.readStrongBinder(), parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            ((q4) this).mo154xaa30c2c7(parcel.readStrongBinder());
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ((q4) this).mo155((Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), parcel.readStrongBinder(), parcel.readInt() != 0);
        parcel2.writeNoException();
        return true;
    }
}
