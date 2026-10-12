package top.bienvenido.date_24323;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import top.bienvenido.mundo.common.ext.MundoAccountResponse;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/h3.class */
public final class h3 extends MundoAccountResponse {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ IBinder f127;

    public h3(IBinder iBinder) {
        this.f127 = iBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // top.bienvenido.mundo.common.ext.MundoAccountResponse
    public final void onResult(Bundle bundle) {
        Parcelable[] parcelableArray = bundle.getParcelableArray("accounts");
        if (parcelableArray == null) {
            return;
        }
        int length = parcelableArray.length;
        Account[] accountArr = new Account[length];
        for (int i = 0; i < length; i++) {
            accountArr[i] = parcelableArray[i];
        }
        m3 m3Var = m3.f224;
        IBinder iBinder = this.f127;
        m3Var.getClass();
        m3.m306(iBinder, accountArr);
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountResponse
    public final void onError(int i, String str) {
    }
}
