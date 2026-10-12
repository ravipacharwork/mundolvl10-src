package top.bienvenido.date_24323;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c3.class */
public final class c3 extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final /* synthetic */ String f35;

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final /* synthetic */ String[] f36dj;

    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public final /* synthetic */ Bundle f37x541a43c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(String str, boolean z, String str2, String[] strArr, Bundle bundle, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, str, z, true, null, false, true);
        this.f35 = str2;
        this.f36dj = strArr;
        this.f37x541a43c1 = bundle;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final void mo101dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f49;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.addAccount(this, this.f42, this.f35, this.f36dj, this.f37x541a43c1);
        }
    }
}
