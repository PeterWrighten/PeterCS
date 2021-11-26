#![allow(non_snake_case)]

fn add(x: i32, y: i32) -> i32
{
    return x + y;
}

fn main() 
{
    let x = add(4, 7);
    println!("Hello, {}", x);
    let y = loop{
        let mut z = 0;
        if z == x  
        {
            break "Found x!";
        }
        z += 1;

    };
    println!("Found x: {}", y);
}
