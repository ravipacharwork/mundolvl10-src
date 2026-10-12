package top.bienvenido.date_24323;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/m4.class */
public final class m4 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Parcelable.Creator f226;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Function1 f227;

    public m4(Parcelable.Creator creator, Function1 function1) {
        this.f226 = creator;
        this.f227 = function1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Object objCreateFromParcel = this.f226.createFromParcel(parcel);
        this.f227.invoke(objCreateFromParcel);
        return objCreateFromParcel;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return this.f226.newArray(i);
    }
}
