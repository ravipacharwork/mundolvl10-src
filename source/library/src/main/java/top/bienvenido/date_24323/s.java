package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/s.class */
public final class s implements u {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f300;

    public s(IBinder iBinder) {
        this.f300 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f300;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo168(String str, String str2, String str3, boolean z, String str4) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAppThread");
            Obtain.writeString(str);
            Obtain.writeString(str2);
            Obtain.writeString(str3);
            Obtain.writeInt(z ? 1 : 0);
            Obtain.writeString(str4);
            this.f300.transact(1, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo170(IBinder iBinder, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f300.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final void mo171xb7bf1d91(IBinder iBinder) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAppThread");
            Obtain.writeStrongBinder(iBinder);
            this.f300.transact(5, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final void mo172() {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAppThread");
            this.f300.transact(6, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final IBinder mo173dj(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeString(str);
            this.f300.transact(7, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readStrongBinder();
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
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了 */
    public final void mo174(String str) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoAppThread");
            Obtain.writeString(str);
            this.f300.transact(9, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo169(IBinder iBinder, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f300.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo201(String str, Intent intent, IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f300.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.u
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo202(Intent intent, IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f300.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
