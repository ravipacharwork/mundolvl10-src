package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/t.class */
public abstract class t extends Binder implements u {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final /* synthetic */ int f326 = 0;

    public t() {
        attachInterface(this, "MundoAppThread");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoAppThread");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoAppThread");
            return true;
        }
        switch (i) {
            case 1:
                ((h6) this).mo168(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                return true;
            case 2:
                ((h6) this).mo169(parcel.readStrongBinder(), (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null));
                return true;
            case 3:
                ((h6) this).mo170(parcel.readStrongBinder(), (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null));
                return true;
            case 4:
                IBinder strongBinder = parcel.readStrongBinder();
                ((h6) this).mo201(parcel.readString(), (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null), strongBinder, parcel.readInt());
                return true;
            case 5:
                ((h6) this).mo171xb7bf1d91(parcel.readStrongBinder());
                return true;
            case 6:
                Process.killProcess(Process.myPid());
                return true;
            case 7:
                IBinder iBinderMo173dj = ((h6) this).mo173dj(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderMo173dj);
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                String string = parcel.readString();
                Intent intent = (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null);
                if (string != null) {
                    a5.m17(intent, string);
                    return true;
                }
                a5.m16(strongBinder2, intent);
                return true;
            case 9:
                ((h6) this).mo174(parcel.readString());
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
