package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/y.class */
public final class y implements b0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f416;

    public y(IBinder iBinder) {
        this.f416 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f416;
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final String mo24(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f416.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.accounts.AuthenticatorDescription[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final AuthenticatorDescription[] mo26xaa30c2c7() {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            this.f416.transact(3, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = (AuthenticatorDescription[]) Obtain.createTypedArray(AuthenticatorDescription.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.accounts.Account[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */
    public final Account[] mo27() {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeString(null);
            parcelObtain.writeInt(0);
            this.f416.transact(4, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = (Account[]) Obtain.createTypedArray(Account.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.accounts.Account[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你 */
    public final Account[] mo28(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeString(str);
            this.f416.transact(5, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = (Account[]) Obtain.createTypedArray(Account.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo29(IBinder iBinder, Account account, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStringArray(strArr);
            this.f416.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo31(IBinder iBinder, String str, String[] strArr) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAccountManagerService");
            Obtain.writeStrongBinder(iBinder);
            Obtain.writeString(str);
            Obtain.writeStringArray(strArr);
            this.f416.transact(8, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了 */
    public final HashMap mo49(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f416.transact(26, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readHashMap(y.class.getClassLoader());
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final String mo35(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f416.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final String mo25(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f416.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo30(IBinder iBinder, String str, String[] strArr) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAccountManagerService");
            Obtain.writeStrongBinder(iBinder);
            Obtain.writeString(str);
            Obtain.writeStringArray(strArr);
            this.f416.transact(7, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo32(IBinder iBinder, Account account, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(z ? 1 : 0);
            this.f416.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo36(Account account, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f416.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo33(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f416.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final boolean mo44(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f416.transact(21, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo34(String str, String str2) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAccountManagerService");
            Obtain.writeString(str);
            Obtain.writeString(str2);
            this.f416.transact(11, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo37(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f416.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo38(Account account, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f416.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo39(IBinder iBinder, Account account, String str, boolean z, boolean z2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f416.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo40(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeStringArray(strArr);
            parcelObtain.writeInt(z ? 1 : 0);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f416.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo41(IBinder iBinder, Account account, String str, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f416.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo42(IBinder iBinder, String str, boolean z) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAccountManagerService");
            Obtain.writeStrongBinder(iBinder);
            Obtain.writeString(str);
            Obtain.writeInt(z ? 1 : 0);
            this.f416.transact(19, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo43(IBinder iBinder, Account account, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(z ? 1 : 0);
            this.f416.transact(20, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo45(IBinder iBinder, String str, String str2) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAccountManagerService");
            Obtain.writeStrongBinder(iBinder);
            Obtain.writeString(str);
            Obtain.writeString(str2);
            this.f416.transact(22, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo46(IBinder iBinder, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f416.transact(23, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo47(IBinder iBinder, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f416.transact(24, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo48(Account account, String str, Bundle bundle, Map map) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAccountManagerService");
            if (account != null) {
                parcelObtain.writeInt(1);
                account.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeMap(map);
            this.f416.transact(25, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
