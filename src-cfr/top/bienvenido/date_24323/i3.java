/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.IAccountAuthenticator
 *  android.accounts.IAccountAuthenticatorResponse
 *  android.accounts.IAccountManagerResponse
 *  android.content.Intent
 *  android.os.Bundle
 */
package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.content.Intent;
import android.os.Bundle;
import top.bienvenido.date_24323.aa;
import top.bienvenido.date_24323.ba;
import top.bienvenido.date_24323.c9;
import top.bienvenido.date_24323.m3;
import top.bienvenido.date_24323.x9;

public final class i3
extends c9 {
    public final /* synthetic */ Account \u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;
    public final /* synthetic */ String \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;
    public final /* synthetic */ Bundle \u8001\u5b50\u53ef\u662f\u51fa\u4e86\u540d\u7684\u4e2d\u56fd\u597d\u820c\u5934\u5f53\u5e74\u8001\u5b50\u4e00\u820c\u5934\u8214\u4f60\u5988\u7684\u4fe9\u5976\u5b50\u8214\u5b8c\u5976\u5b50\u518d\u8214\u9634\u8482\u628a\u4f60\u5988\u8c03\u6559\u50cf\u6761\u6bcd\u72d7\u4e00\u6837\u7684\u4e56\u4f60\u5988\u8fd8\u81ea\u613f\u8ba9\u8001\u5b50\u6bcf\u5929\u808f\u54e5\u7684\u9e21\u5df4\u808f\u7684\u8ba9\u4f60\u5988\u6bcf\u5929\u90fd\u8ddf\u6d3b\u5728\u5929\u5802\u4e00\u6837;
    public final /* synthetic */ boolean \u6211\u5728\u64cd\u4f60\u5988\u7684\u540c\u65f6\u7ed9\u4f60\u5988\u7684\u4e0b\u4f53\u753b\u4e86\u4e00\u5e45\u6e05\u660e\u4e0a\u6cb3\u56fe\u8fd9\u4f7f\u5f97\u4f60\u5988\u7684\u5356\u903c\u4e8b\u4e1a\u5728\u6587\u5b66\u754c\u4e5f\u6709\u4e86\u4e00\u5b9a\u7684\u540d\u6c14\u4f60\u5a4a\u5b50\u5988\u8ba9\u81ea\u5df1\u7684\u903c\u6cbe\u4e0a\u4e86\u6587\u5b66\u7684\u6c14\u606f\u4ee5\u540e\u5ad6\u5ba2\u64cd\u4f60\u5988\u65f6\u8fd8\u80fd\u589e\u957f\u6587\u5316;
    public final /* synthetic */ boolean \u8bf4\u8bdd\u4e0d\u8fc7\u8111\u5b50\u76f4\u63a5\u4ece\u60a8\u5c41\u773c\u91cc\u5d29\u51fa\u6765;

    public i3(IAccountManagerResponse iAccountManagerResponse, boolean bl, Account account, String string, Bundle bundle, boolean bl2, boolean bl3, String string2, String string3) {
        this.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b = account;
        this.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6 = string;
        this.\u8001\u5b50\u53ef\u662f\u51fa\u4e86\u540d\u7684\u4e2d\u56fd\u597d\u820c\u5934\u5f53\u5e74\u8001\u5b50\u4e00\u820c\u5934\u8214\u4f60\u5988\u7684\u4fe9\u5976\u5b50\u8214\u5b8c\u5976\u5b50\u518d\u8214\u9634\u8482\u628a\u4f60\u5988\u8c03\u6559\u50cf\u6761\u6bcd\u72d7\u4e00\u6837\u7684\u4e56\u4f60\u5988\u8fd8\u81ea\u613f\u8ba9\u8001\u5b50\u6bcf\u5929\u808f\u54e5\u7684\u9e21\u5df4\u808f\u7684\u8ba9\u4f60\u5988\u6bcf\u5929\u90fd\u8ddf\u6d3b\u5728\u5929\u5802\u4e00\u6837 = bundle;
        this.\u6211\u5728\u64cd\u4f60\u5988\u7684\u540c\u65f6\u7ed9\u4f60\u5988\u7684\u4e0b\u4f53\u753b\u4e86\u4e00\u5e45\u6e05\u660e\u4e0a\u6cb3\u56fe\u8fd9\u4f7f\u5f97\u4f60\u5988\u7684\u5356\u903c\u4e8b\u4e1a\u5728\u6587\u5b66\u754c\u4e5f\u6709\u4e86\u4e00\u5b9a\u7684\u540d\u6c14\u4f60\u5a4a\u5b50\u5988\u8ba9\u81ea\u5df1\u7684\u903c\u6cbe\u4e0a\u4e86\u6587\u5b66\u7684\u6c14\u606f\u4ee5\u540e\u5ad6\u5ba2\u64cd\u4f60\u5988\u65f6\u8fd8\u80fd\u589e\u957f\u6587\u5316 = bl2;
        this.\u8bf4\u8bdd\u4e0d\u8fc7\u8111\u5b50\u76f4\u63a5\u4ece\u60a8\u5c41\u773c\u91cc\u5d29\u51fa\u6765 = bl3;
        super(iAccountManagerResponse, string2, bl, false, string3, false, false);
    }

    @Override
    public final void \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6() {
        block7: {
            block6: {
                IAccountAuthenticator iAccountAuthenticator;
                try {
                    iAccountAuthenticator = this.\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c;
                    if (iAccountAuthenticator == null) break block6;
                }
                catch (Exception exception) {}
                IAccountAuthenticator iAccountAuthenticator2 = iAccountAuthenticator;
                i3 i32 = this;
                i3 i33 = i32;
                i3 i34 = i32;
                iAccountAuthenticator = i32.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;
                String string = i34.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;
                Bundle bundle = i33.\u8001\u5b50\u53ef\u662f\u51fa\u4e86\u540d\u7684\u4e2d\u56fd\u597d\u820c\u5934\u5f53\u5e74\u8001\u5b50\u4e00\u820c\u5934\u8214\u4f60\u5988\u7684\u4fe9\u5976\u5b50\u8214\u5b8c\u5976\u5b50\u518d\u8214\u9634\u8482\u628a\u4f60\u5988\u8c03\u6559\u50cf\u6761\u6bcd\u72d7\u4e00\u6837\u7684\u4e56\u4f60\u5988\u8fd8\u81ea\u613f\u8ba9\u8001\u5b50\u6bcf\u5929\u808f\u54e5\u7684\u9e21\u5df4\u808f\u7684\u8ba9\u4f60\u5988\u6bcf\u5929\u90fd\u8ddf\u6d3b\u5728\u5929\u5802\u4e00\u6837;
                iAccountAuthenticator2.getAuthToken((IAccountAuthenticatorResponse)this, (Account)iAccountAuthenticator, string, bundle);
                return;
                break block7;
            }
            return;
        }
    }

    @Override
    public final void onResult(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("authtoken");
            if (string != null) {
                Bundle bundle2 = bundle;
                String string2 = bundle2.getString("authAccount");
                String string3 = bundle2.getString("accountType");
                if (string3 != null && string3.length() != 0 && string2 != null && string2.length() != 0) {
                    Object object;
                    if (!this.\u6211\u5728\u64cd\u4f60\u5988\u7684\u540c\u65f6\u7ed9\u4f60\u5988\u7684\u4e0b\u4f53\u753b\u4e86\u4e00\u5e45\u6e05\u660e\u4e0a\u6cb3\u56fe\u8fd9\u4f7f\u5f97\u4f60\u5988\u7684\u5356\u903c\u4e8b\u4e1a\u5728\u6587\u5b66\u754c\u4e5f\u6709\u4e86\u4e00\u5b9a\u7684\u540d\u6c14\u4f60\u5a4a\u5b50\u5988\u8ba9\u81ea\u5df1\u7684\u903c\u6cbe\u4e0a\u4e86\u6587\u5b66\u7684\u6c14\u606f\u4ee5\u540e\u5ad6\u5ba2\u64cd\u4f60\u5988\u65f6\u8fd8\u80fd\u589e\u957f\u6587\u5316) {
                        Account account;
                        object = account;
                        account = new Account(string2, string3);
                        m3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Account)object, this.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6, string);
                    }
                    long l10 = bundle.getLong("android.accounts.expiry", 0L);
                    if (this.\u6211\u5728\u64cd\u4f60\u5988\u7684\u540c\u65f6\u7ed9\u4f60\u5988\u7684\u4e0b\u4f53\u753b\u4e86\u4e00\u5e45\u6e05\u660e\u4e0a\u6cb3\u56fe\u8fd9\u4f7f\u5f97\u4f60\u5988\u7684\u5356\u903c\u4e8b\u4e1a\u5728\u6587\u5b66\u754c\u4e5f\u6709\u4e86\u4e00\u5b9a\u7684\u540d\u6c14\u4f60\u5a4a\u5b50\u5988\u8ba9\u81ea\u5df1\u7684\u903c\u6cbe\u4e0a\u4e86\u6587\u5b66\u7684\u6c14\u606f\u4ee5\u540e\u5ad6\u5ba2\u64cd\u4f60\u5988\u65f6\u8fd8\u80fd\u589e\u957f\u6587\u5316 && l10 > System.currentTimeMillis()) {
                        object = m3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
                        Account account = this.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;
                        Account account2 = object;
                        object = this.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;
                        account2.getClass();
                        if (account != null && object != null) {
                            Object object2 = m3.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988;
                            object2.getClass();
                            if (System.currentTimeMillis() <= l10) {
                                aa aa2;
                                x9 x92;
                                ba ba2 = object2;
                                object2 = x92;
                                x92 = new x9(account, (String)object);
                                object = aa2;
                                aa2 = new aa(string, l10);
                                ba2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((x9)object2, (aa)object);
                            }
                        }
                    }
                } else {
                    this.onError(5, "the type and name should not be empty");
                    return;
                }
            }
            if ((Intent)bundle.getParcelable("intent") != null && this.\u8bf4\u8bdd\u4e0d\u8fc7\u8111\u5b50\u76f4\u63a5\u4ece\u60a8\u5c41\u773c\u91cc\u5d29\u51fa\u6765 && !this.\u6211\u5728\u64cd\u4f60\u5988\u7684\u540c\u65f6\u7ed9\u4f60\u5988\u7684\u4e0b\u4f53\u753b\u4e86\u4e00\u5e45\u6e05\u660e\u4e0a\u6cb3\u56fe\u8fd9\u4f7f\u5f97\u4f60\u5988\u7684\u5356\u903c\u4e8b\u4e1a\u5728\u6587\u5b66\u754c\u4e5f\u6709\u4e86\u4e00\u5b9a\u7684\u540d\u6c14\u4f60\u5a4a\u5b50\u5988\u8ba9\u81ea\u5df1\u7684\u903c\u6cbe\u4e0a\u4e86\u6587\u5b66\u7684\u6c14\u606f\u4ee5\u540e\u5ad6\u5ba2\u64cd\u4f60\u5988\u65f6\u8fd8\u80fd\u589e\u957f\u6587\u5316) {
                c9.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(bundle);
            }
        }
        super.onResult(bundle);
    }
}

