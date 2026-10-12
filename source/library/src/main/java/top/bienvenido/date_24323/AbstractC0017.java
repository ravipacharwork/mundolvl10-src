package top.bienvenido.date_24323;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import com.android.internal.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你妈自挂东南枝坐好等鞭尸, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你妈自挂东南枝坐好等鞭尸.class */
public abstract class AbstractC0017 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [top.bienvenido.date_24323.m1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static m1 m610(Resources resources, String str, AttributeSet attributeSet, ServiceInfo serviceInfo) {
        try {
            ?? ObtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.AccountAuthenticator);
            try {
                String string = ObtainAttributes.getString(R.styleable.AccountAuthenticator_accountType);
                if (string == null || string.length() == 0) {
                    ObtainAttributes.recycle();
                    return null;
                }
                ObtainAttributes = new m1(string, str, ObtainAttributes.getResourceId(R.styleable.AccountAuthenticator_label, 0), ObtainAttributes.getResourceId(R.styleable.AccountAuthenticator_icon, 0), ObtainAttributes.getResourceId(R.styleable.AccountAuthenticator_smallIcon, 0), ObtainAttributes.getResourceId(R.styleable.AccountAuthenticator_accountPreferences, 0), ObtainAttributes.getBoolean(R.styleable.AccountAuthenticator_customTokens, false), serviceInfo);
                ObtainAttributes.recycle();
                return ObtainAttributes;
            } catch (Throwable unused) {
                ObtainAttributes.recycle();
                throw ObtainAttributes;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static m1 m611(ResolveInfo resolveInfo) {
        int next;
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        PackageManager packageManager = b3.f17.getPackageManager();
        try {
            XmlResourceParser xmlResourceParserLoadXmlMetaData = serviceInfo.loadXmlMetaData(packageManager, "android.accounts.AccountAuthenticator");
            if (xmlResourceParserLoadXmlMetaData == null) {
                return null;
            }
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParserLoadXmlMetaData);
                Ref.IntRef intRef = new Ref.IntRef();
                do {
                    next = xmlResourceParserLoadXmlMetaData.next();
                    intRef.element = next;
                    if (next == 1) {
                        break;
                    }
                } while (next != 2);
                if (!Intrinsics.areEqual("account-authenticator", xmlResourceParserLoadXmlMetaData.getName())) {
                    AutoCloseableKt.closeFinally(xmlResourceParserLoadXmlMetaData, (Throwable) null);
                    return null;
                }
                m1 m1VarM610 = m610(packageManager.getResourcesForApplication(serviceInfo.applicationInfo), serviceInfo.packageName, attributeSetAsAttributeSet, serviceInfo);
                AutoCloseableKt.closeFinally(xmlResourceParserLoadXmlMetaData, (Throwable) null);
                return m1VarM610;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(th2, th);
                    throw th;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ArrayList m612() {
        int i = 128;
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayListMo299 = r5.f290.mo299();
        Intent intent = new Intent("android.accounts.AccountAuthenticator");
        for (String str : arrayListMo299) {
            r5 r5Var = r5.f290;
            r5Var.getClass();
            if (r5.f291.containsKey(str)) {
                arrayList.addAll(r5Var.mo275(intent.setPackage(str), null, 128));
            } else {
                Context context = b3.f17;
                List list = (List) b3.m57((v3) -> {
                    return m609(r0, r1, r2, v3);
                });
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m609(Intent intent, String str, int i, PackageManager packageManager) {
        return packageManager.queryIntentServices(intent.setPackage(str), i);
    }
}
