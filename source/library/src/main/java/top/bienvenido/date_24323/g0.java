package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/g0.class */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f113;

    public g0(IBinder iBinder) {
        this.f113 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f113;
    }

    @Override // top.bienvenido.date_24323.i0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void mo153(Uri uri, IBinder iBinder, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoContentService");
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeStrongBinder(iBinder);
            this.f113.transact(1, parcelObtain, parcelObtain2, 0);
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
    @Override // top.bienvenido.date_24323.i0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final void mo154xaa30c2c7(IBinder iBinder) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoContentService");
            Obtain.writeStrongBinder(iBinder);
            this.f113.transact(2, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.i0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo155(Uri uri, IBinder iBinder, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoContentService");
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f113.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
