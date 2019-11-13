import com.psj.starter.App;
import com.psj.starter.bean.entity.SysRole;
import com.sun.codemodel.internal.JForEach;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @program: jluzh-psj-starter
 * @description: 测试对象get属性和点属性
 * @author: DemonsPan
 * @create: 2019-11-05 11:09
 **/

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class ObjectTest {
    @Test
    public void testGetMethod() {
        SysRole role = new SysRole();
        role.setName("");

        if (role.getName() == "") {
            System.out.println("通过了");
        } else {
            System.out.println("else了");

        }
    }

    @Test
    public void insertSort() {
        int[] arr = new int[7];
        arr[0] = 9;
        arr[1] = 4;
        arr[2] = 2;
        arr[3] = 7;
        arr[4] = 6;
        arr[5] = 0;
        arr[6] = 1;
        System.out.print("原顺序:");
        Arrays.stream(arr).forEach(System.out::print);
        /*插入排序*/
        int i, j, key;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];  //key为目标比较值
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];  //原排序比较大的则后移一位
                } else break;  //进行插入操作,并跳出本次循环开始下一个目标比较值
            }
            arr[j + 1] = key;  //插入到目标位置
        }
        System.out.print("插入排序后的顺序:");
        Arrays.stream(arr).forEach(System.out::print);
    }

    @Test
    public void shellSort() {
        int[] arr = new int[7];
        arr[0] = 9;
        arr[1] = 4;
        arr[2] = 2;
        arr[3] = 7;
        arr[4] = 6;
        arr[5] = 0;
        arr[6] = 1;
        System.out.print("原顺序:");
        Arrays.stream(arr).forEach(System.out::print);
        /*希尔排序*/
        int gap = 1;
        int i, j, key;
        while (gap <= arr.length / 3) {
            gap = gap * 3 - 1;
        }
        while (gap > 0) {
            for (i = gap; i < arr.length; i = i + gap) {
                key = arr[i];
                for (j = i - gap; j >= 0; j = j - gap) {
                    if (arr[j] > key) {
                        arr[j + gap] = arr[j];  //原排序比较大的则后移一位
                    } else break;  //进行插入操作,并跳出本次循环开始下一个目标比较值
                }
                arr[j + gap] = key;  //插入到目标位置
            }
            gap = (gap - 1) / 3;
        }

        System.out.print("希尔排序后的顺序:");
        Arrays.stream(arr).forEach(System.out::print);
    }


}
