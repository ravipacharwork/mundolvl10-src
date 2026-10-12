package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/z.class */
public abstract class z extends Binder implements b0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final /* synthetic */ int f430 = 0;

    public z() {
        attachInterface(this, "MundoAccountManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoAccountManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoAccountManagerService");
            return true;
        }
        switch (i) {
            case 1:
                String strMo24 = ((m3) this).mo24((Account) a0.m3(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strMo24);
                return true;
            case 2:
                String strMo25 = ((m3) this).mo25((Account) a0.m3(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo25);
                return true;
            case 3:
                AuthenticatorDescription[] authenticatorDescriptionArrMo26xaa30c2c7 = ((m3) this).mo26xaa30c2c7();
                parcel2.writeNoException();
                parcel2.writeTypedArray(authenticatorDescriptionArrMo26xaa30c2c7, 1);
                return true;
            case 4:
                parcel.readString();
                parcel.readInt();
                Account[] accountArrMo27 = ((m3) this).mo27();
                parcel2.writeNoException();
                parcel2.writeTypedArray(accountArrMo27, 1);
                return true;
            case 5:
                Account[] accountArrMo28 = ((m3) this).mo28(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedArray(accountArrMo28, 1);
                return true;
            case 6:
                ((m3) this).mo29(parcel.readStrongBinder(), (Account) (parcel.readInt() != 0 ? Account.CREATOR.createFromParcel(parcel) : null), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 7:
                ((m3) this).mo30(parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 8:
                ((m3) this).mo31(parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 9:
                ((m3) this).mo32(parcel.readStrongBinder(), (Account) (parcel.readInt() != 0 ? Account.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 10:
                Account account = (Account) a0.m3(parcel, Account.CREATOR);
                boolean zM310 = account == null ? false : m3.m310(account);
                parcel2.writeNoException();
                parcel2.writeInt(zM310 ? 1 : 0);
                return true;
            case 11:
                ((m3) this).mo34(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                String strMo35 = ((m3) this).mo35((Account) a0.m3(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo35);
                return true;
            case 13:
                ((m3) this).mo36((Account) a0.m3(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                ((m3) this).mo37((Account) a0.m3(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                ((m3) this).mo38((Account) a0.m3(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                ((m3) this).mo39(parcel.readStrongBinder(), (Account) (parcel.readInt() != 0 ? Account.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            case 17:
                ((m3) this).mo40(parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            case 18:
                ((m3) this).mo41(parcel.readStrongBinder(), (Account) (parcel.readInt() != 0 ? Account.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            case 19:
                ((m3) this).mo42(parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 20:
                ((m3) this).mo43(parcel.readStrongBinder(), (Account) (parcel.readInt() != 0 ? Account.CREATOR.createFromParcel(parcel) : null), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 21:
                boolean zMo44 = ((m3) this).mo44((Account) a0.m3(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo44 ? 1 : 0);
                return true;
            case 22:
                ((m3) this).mo45(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 23:
                ((m3) this).mo46(parcel.readStrongBinder(), (Account) (parcel.readInt() != 0 ? Account.CREATOR.createFromParcel(parcel) : null), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 24:
                ((m3) this).mo47(parcel.readStrongBinder(), (Account) (parcel.readInt() != 0 ? Account.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            case 25:
                boolean zMo48 = ((m3) this).mo48((Account) a0.m3(parcel, Account.CREATOR), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeInt(zMo48 ? 1 : 0);
                return true;
            case 26:
                HashMap mapMo49 = ((m3) this).mo49(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(mapMo49);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
